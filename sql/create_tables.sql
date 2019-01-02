CREATE TABLE `competition_details_tab` (
  `det_id` int(11) NOT NULL,
  `s_id` int(11) DEFAULT NULL,
  `c_id` int(11) DEFAULT NULL,
  `t_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`det_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `competition_tab` (
  `c_id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `match_details_tab` (
  `M_ID` int(11) DEFAULT NULL,
  `T_ID` int(11) DEFAULT NULL,
  `P_ID` int(11) DEFAULT NULL,
  `TIME` int(11) DEFAULT NULL,
  `DETAIL` text,
  `D_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `match_squads_tab` (
  `SQ_ID` int(11) DEFAULT NULL,
  `ROLE` text,
  `M_ID` int(11) DEFAULT NULL,
  `T_ID` int(11) DEFAULT NULL,
  `P_ID` int(11) DEFAULT NULL,
  `SUBST` int(11) DEFAULT NULL,
  `SP_ID` int(11) DEFAULT NULL,
  `M_TIME` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `match_tab` (
  `M_ID` int(11) DEFAULT NULL,
  `FDATE` text,
  `S_ID` int(11) DEFAULT NULL,
  `C_ID` int(11) DEFAULT NULL,
  `HT_ID` int(11) DEFAULT NULL,
  `AT_ID` int(11) DEFAULT NULL,
  `HG` int(11) DEFAULT NULL,
  `AG` int(11) DEFAULT NULL,
  `OT` int(11) DEFAULT NULL,
  `OT_HG` int(11) DEFAULT NULL,
  `OT_AG` int(11) DEFAULT NULL,
  `PEN` int(11) DEFAULT NULL,
  `P_HG` int(11) DEFAULT NULL,
  `P_AG` int(11) DEFAULT NULL,
  `R_ID` int(11) DEFAULT NULL,
  `FT` int(11) DEFAULT NULL,
  `ATTENDANCE` text,
  `squads` int(11) DEFAULT NULL,
  `details` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `match_tab_copy` (
  `M_ID` int(11) DEFAULT NULL,
  `FDATE` text,
  `S_ID` int(11) DEFAULT NULL,
  `C_ID` int(11) DEFAULT NULL,
  `HT_ID` int(11) DEFAULT NULL,
  `AT_ID` int(11) DEFAULT NULL,
  `HG` int(11) DEFAULT NULL,
  `AG` int(11) DEFAULT NULL,
  `OT` int(11) DEFAULT NULL,
  `OT_HG` int(11) DEFAULT NULL,
  `OT_AG` int(11) DEFAULT NULL,
  `PEN` int(11) DEFAULT NULL,
  `P_HG` int(11) DEFAULT NULL,
  `P_AG` int(11) DEFAULT NULL,
  `R_ID` int(11) DEFAULT NULL,
  `FT` int(11) DEFAULT NULL,
  `ATTENDANCE` text,
  `squads` int(11) DEFAULT NULL,
  `details` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `people_names_tab` (
  `P_ID` int(11) DEFAULT NULL,
  `BBC` text,
  `n1` varchar(45) DEFAULT NULL,
  `n2` varchar(45) DEFAULT NULL,
  `n3` varchar(45) DEFAULT NULL,
  `n4` varchar(45) DEFAULT NULL,
  `n5` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `people_tab` (
  `P_ID` int(11) DEFAULT NULL,
  `FNAME` text,
  `LNAME` text,
  `NATIONALITY` text,
  `BIRTH` text,
  `SUBROLE` text,
  `T_ID` int(11) DEFAULT NULL,
  `ROLE` varchar(10) DEFAULT NULL,
  `SHIRT_NO` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `people_tmp_tab` (
  `TP_ID` int(11) DEFAULT NULL,
  `M_ID` int(11) DEFAULT NULL,
  `T_ID` int(11) DEFAULT NULL,
  `FULLNAME` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `season_tab` (
  `s_id` int(11) NOT NULL,
  `season` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `team_names_tab` (
  `t_id` int(11) NOT NULL,
  `N1` varchar(45) DEFAULT NULL,
  `N2` varchar(45) DEFAULT NULL,
  `N3` varchar(45) DEFAULT NULL,
  `N4` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `team_tab` (
  `t_id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `st_d` int(11) DEFAULT NULL,
  PRIMARY KEY (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `test_table` (
  `id` int(11) NOT NULL,
  `text` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `types` (
  `id_type` int(11) NOT NULL,
  `id_bet` int(11) DEFAULT NULL,
  `h_team` varchar(45) DEFAULT NULL,
  `a_team` varchar(45) DEFAULT NULL,
  `hg` int(11) DEFAULT NULL,
  `ag` int(11) DEFAULT NULL,
  `course` float DEFAULT NULL,
  `type` varchar(4) DEFAULT NULL,
  `scored` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
