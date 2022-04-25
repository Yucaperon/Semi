package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//porject_tblのEntity宣言
@Entity
@Data
@Table(name = "project_tbl")
public class Projecttbl {

//プロジェクトID
    @Id
    @Column(name = "PROJ_ID")
    private String PROJ_ID;

//外部のユーザーID
    @Column(name = "FK_USER_ID")
    private String FK_USER_ID;

//プロジェクト名
    @Column(name = "PROJ_NAME")
    private String PROJ_NAME;

//プロジェクトのpath
    @Column(name = "PROJ_ADDREES")
    private String PROJ_ADDREES;

//プロジェクトのジャンル
    @Column(name = "PROJ_GENRE")
    private int PROJ_GENRE;

//プロジェクト公開非公開
    @Column(name = "PROJ_OPEN_FLG")
    private int PROJ_OPEN_FLG;

//プロジェクトを最後に触った時間
    @Column(name = "PROJ_LAST_TIME")
    private Date PROJ_LAST_TIME;
    
  //プロジェクトをアップロードした時間
    @Column(name = "PROJ_UP_TIME")
    private Date PROJ_UP_TIME;
    
  //プロジェクトを作成した時間
    @Column(name = "PROJ_MAKE_TIME")
    private Date PROJ_MAKE_TIME;
    
  //閲覧数
    @Column(name = "PROJ_BROW_CNT")
    private int PROJ_BROW_CNT;
    
    //DL数
    @Column(name = "PROJ_DL_CNT")
    private int PROJ_DL_CNT;
    
    //プロジェクトの紹介文
    @Column(name = "PROJ_INTRO")
    private String PROJ_INTRO;
}