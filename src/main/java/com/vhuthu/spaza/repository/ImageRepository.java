package com.vhuthu.spaza.repository;

import com.vhuthu.spaza.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}