package com.shop.service;

import com.shop.entity.ItemImg;
import com.shop.repository.ItemImgRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.util.StringUtils;

import javax.persistence.EntityNotFoundException;
import java.io.IOException;
import java.util.Objects;

@Service
@Transactional
@RequiredArgsConstructor
public class ItemImgService {

    @Value("${itemImgLocation}")
    private String itemImgLocation;

    private final ItemImgRepository itemImgRepository;

    private final FileService fileService;

    public void saveItemImg(ItemImg itemImg, MultipartFile itemImgFile) throws IOException {

        // 이미지 파일 업로드
        String oriImgName = itemImgFile.getOriginalFilename();
        String imgName = fileService.uploadFile(itemImgLocation, Objects.requireNonNull(oriImgName), itemImgFile.getBytes());
        String imgUrl = "/images/item/" + imgName;

        // 상품 이미지 정보 저장
        itemImg.updateItemImg(oriImgName, imgName, imgUrl);
        itemImgRepository.save(itemImg);
    }

    public void updateItemImg(Long itemImgId, MultipartFile itemImgFile) throws IOException {

        ItemImg itemImg = itemImgRepository.findById(itemImgId).orElseThrow(EntityNotFoundException::new);

        // 기존 이미지 파일 삭제
        if (!StringUtils.isEmpty(itemImg.getImgName())) {
            fileService.deleteFile(itemImgLocation + "/" + itemImg.getImgName());
        }

        // 이미지 파일 업로드
        String oriImgName = itemImgFile.getOriginalFilename();
        String imgName = fileService.uploadFile(itemImgLocation, Objects.requireNonNull(oriImgName), itemImgFile.getBytes());
        String imgUrl = "/images/item/" + imgName;

        // 상품 이미지 정보 저장
        itemImg.updateItemImg(oriImgName, imgName, imgUrl);
    }

}
