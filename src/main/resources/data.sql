INSERT INTO `continents` (`id`, `name`, `code`)
VALUES (1, 'Africa', 'AF'),
       (2, 'Antarctica', 'AN'),
       (3, 'Asia', 'AS'),
       (4, 'Europe', 'EU'),
       (5, 'North America', 'NA'),
       (6, 'Oceania', 'OC'),
       (7, 'South America', 'SA');


INSERT INTO `countries` (`id`, `name`, `code`, `iso3_code`, `phone_code`, `continent_code`, `flag_url`)
VALUES (1, 'Andorra', 'AD', 'AND', 020, 'EU', 'https://flagcdn.com/'),
       (2, 'United Arab Emirates', 'AE', 'ARE', 784, 'AS', 'https://flagcdn.com/'),
       (3, 'Afghanistan', 'AF', 'AFG', 004, 'AS', 'https://flagcdn.com/'),
       (4, 'Antigua and Barbuda', 'AG', 'ATG', 028, 'NA', 'https://flagcdn.com/'),
       (5, 'Anguilla', 'AI', 'AIA', 660, 'NA', 'https://flagcdn.com/'),
       (6, 'Albania', 'AL', 'ALB', 008, 'EU', 'https://flagcdn.com/'),
       (7, 'Armenia', 'AM', 'ARM', 051, 'AS', 'https://flagcdn.com/'),
       (8, 'Netherlands Antilles', 'AN', 'ANT', 530, 'NA', 'https://flagcdn.com/'),
       (9, 'Angola', 'AO', 'AGO', 024, 'AF', 'https://flagcdn.com/'),
       (10, 'Antarctica', 'AQ', 'ATA', 010, 'AN', 'https://flagcdn.com/'),
       (11, 'Argentina', 'AR', 'ARG', 032, 'SA', 'https://flagcdn.com/'),
       (12, 'American Samoa', 'AS', 'ASM', 016, 'OC', 'https://flagcdn.com/'),
       (13, 'Austria', 'AT', 'AUT', 040, 'EU', 'https://flagcdn.com/'),
       (14, 'Australia', 'AU', 'AUS', 036, 'OC', 'https://flagcdn.com/'),
       (15, 'Aruba', 'AW', 'ABW', 533, 'NA', 'https://flagcdn.com/'),
       (16, 'Åland', 'AX', 'ALA', 248, 'EU', 'https://flagcdn.com/'),
       (17, 'Azerbaijan', 'AZ', 'AZE', 031, 'AS', 'https://flagcdn.com/'),
       (18, 'Bosnia and Herzegovina', 'BA', 'BIH', 070, 'EU', 'https://flagcdn.com/'),
       (19, 'Barbados', 'BB', 'BRB', 052, 'NA', 'https://flagcdn.com/'),
       (20, 'Bangladesh', 'BD', 'BGD', 050, 'AS', 'https://flagcdn.com/'),
       (21, 'Belgium', 'BE', 'BEL', 056, 'EU', 'https://flagcdn.com/'),
       (22, 'Burkina Faso', 'BF', 'BFA', 854, 'AF', 'https://flagcdn.com/'),
       (23, 'Bulgaria', 'BG', 'BGR', 100, 'EU', 'https://flagcdn.com/'),
       (24, 'Bahrain', 'BH', 'BHR', 048, 'AS', 'https://flagcdn.com/'),
       (25, 'Burundi', 'BI', 'BDI', 108, 'AF', 'https://flagcdn.com/'),
       (26, 'Benin', 'BJ', 'BEN', 204, 'AF', 'https://flagcdn.com/'),
       (27, 'Saint Barthélemy', 'BL', 'BLM', 652, 'NA', 'https://flagcdn.com/'),
       (28, 'Bermuda', 'BM', 'BMU', 060, 'NA', 'https://flagcdn.com/'),
       (29, 'Brunei Darussalam', 'BN', 'BRN', 096, 'AS', 'https://flagcdn.com/'),
       (30, 'Bolivia', 'BO', 'BOL', 068, 'SA', 'https://flagcdn.com/'),
       (31, 'Brazil', 'BR', 'BRA', 076, 'SA', 'https://flagcdn.com/'),
       (32, 'Bahamas', 'BS', 'BHS', 044, 'NA', 'https://flagcdn.com/'),
       (33, 'Bhutan', 'BT', 'BTN', 064, 'AS', 'https://flagcdn.com/'),
       (34, 'Bouvet Island', 'BV', 'BVT', 074, 'AN', 'https://flagcdn.com/'),
       (35, 'Botswana', 'BW', 'BWA', 072, 'AF', 'https://flagcdn.com/'),
       (36, 'Belarus', 'BY', 'BLR', 112, 'EU', 'https://flagcdn.com/'),
       (37, 'Belize', 'BZ', 'BLZ', 084, 'NA', 'https://flagcdn.com/'),
       (38, 'Canada', 'CA', 'CAN', 124, 'NA', 'https://flagcdn.com/'),
       (39, 'Cocos (Keeling) Islands', 'CC', 'CCK', 166, 'AS', 'https://flagcdn.com/'),
       (40, 'Congo (Kinshasa)', 'CD', 'COD', 180, 'AF', 'https://flagcdn.com/'),
       (41, 'Central African Republic', 'CF', 'CAF', 140, 'AF', 'https://flagcdn.com/'),
       (42, 'Congo (Brazzaville)', 'CG', 'COG', 178, 'AF', 'https://flagcdn.com/'),
       (43, 'Switzerland', 'CH', 'CHE', 756, 'EU', 'https://flagcdn.com/'),
       (44, 'Côte d\'Ivoire', 'CI', 'CIV', 384, 'AF', 'https://flagcdn.com/'),
       (45, 'Cook Islands', 'CK', 'COK', 184, 'OC', 'https://flagcdn.com/'),
       (46, 'Chile', 'CL', 'CHL', 152, 'SA', 'https://flagcdn.com/'),
       (47, 'Cameroon', 'CM', 'CMR', 120, 'AF', 'https://flagcdn.com/'),
       (48, 'China', 'CN', 'CHN', 156, 'AS', 'https://flagcdn.com/'),
       (49, 'Colombia', 'CO', 'COL', 170, 'SA', 'https://flagcdn.com/'),
       (50, 'Costa Rica', 'CR', 'CRI', 188, 'NA', 'https://flagcdn.com/'),
       (51, 'Cuba', 'CU', 'CUB', 192, 'NA', 'https://flagcdn.com/'),
       (52, 'Cape Verde', 'CV', 'CPV', 132, 'AF', 'https://flagcdn.com/'),
       (53, 'Christmas Island', 'CX', 'CXR', 162, 'AS', 'https://flagcdn.com/'),
       (54, 'Cyprus', 'CY', 'CYP', 196, 'AS', 'https://flagcdn.com/'),
       (55, 'Czech Republic', 'CZ', 'CZE', 203, 'EU', 'https://flagcdn.com/'),
       (56, 'Germany', 'DE', 'DEU', 276, 'EU', 'https://flagcdn.com/'),
       (57, 'Djibouti', 'DJ', 'DJI', 262, 'AF', 'https://flagcdn.com/'),
       (58, 'Denmark', 'DK', 'DNK', 208, 'EU', 'https://flagcdn.com/'),
       (59, 'Dominica', 'DM', 'DMA', 212, 'NA', 'https://flagcdn.com/'),
       (60, 'Dominican Republic', 'DO', 'DOM', 214, 'NA', 'https://flagcdn.com/'),
       (61, 'Algeria', 'DZ', 'DZA', 012, 'AF', 'https://flagcdn.com/'),
       (62, 'Ecuador', 'EC', 'ECU', 218, 'SA', 'https://flagcdn.com/'),
       (63, 'Estonia', 'EE', 'EST', 233, 'EU', 'https://flagcdn.com/'),
       (64, 'Egypt', 'EG', 'EGY', 818, 'AF', 'https://flagcdn.com/'),
       (65, 'Western Sahara', 'EH', 'ESH', 732, 'AF', 'https://flagcdn.com/'),
       (66, 'Eritrea', 'ER', 'ERI', 232, 'AF', 'https://flagcdn.com/'),
       (67, 'Spain', 'ES', 'ESP', 724, 'EU', 'https://flagcdn.com/'),
       (68, 'Ethiopia', 'ET', 'ETH', 231, 'AF', 'https://flagcdn.com/'),
       (69, 'Finland', 'FI', 'FIN', 246, 'EU', 'https://flagcdn.com/'),
       (70, 'Fiji', 'FJ', 'FJI', 242, 'OC', 'https://flagcdn.com/'),
       (71, 'Falkland Islands', 'FK', 'FLK', 238, 'SA', 'https://flagcdn.com/'),
       (72, 'Micronesia', 'FM', 'FSM', 583, 'OC', 'https://flagcdn.com/'),
       (73, 'Faroe Islands', 'FO', 'FRO', 234, 'EU', 'https://flagcdn.com/'),
       (74, 'France', 'FR', 'FRA', 250, 'EU', 'https://flagcdn.com/'),
       (75, 'Gabon', 'GA', 'GAB', 266, 'AF', 'https://flagcdn.com/'),
       (76, 'United Kingdom', 'GB', 'GBR', 826, 'EU', 'https://flagcdn.com/'),
       (77, 'Grenada', 'GD', 'GRD', 308, 'NA', 'https://flagcdn.com/'),
       (78, 'Georgia', 'GE', 'GEO', 268, 'AS', 'https://flagcdn.com/'),
       (79, 'French Guiana', 'GF', 'GUF', 254, 'SA', 'https://flagcdn.com/'),
       (80, 'Guernsey', 'GG', 'GGY', 831, 'EU', 'https://flagcdn.com/'),
       (81, 'Ghana', 'GH', 'GHA', 288, 'AF', 'https://flagcdn.com/'),
       (82, 'Gibraltar', 'GI', 'GIB', 292, 'EU', 'https://flagcdn.com/'),
       (83, 'Greenland', 'GL', 'GRL', 304, 'NA', 'https://flagcdn.com/'),
       (84, 'Gambia', 'GM', 'GMB', 270, 'AF', 'https://flagcdn.com/'),
       (85, 'Guinea', 'GN', 'GIN', 324, 'AF', 'https://flagcdn.com/'),
       (86, 'Guadeloupe', 'GP', 'GLP', 312, 'NA', 'https://flagcdn.com/'),
       (87, 'Equatorial Guinea', 'GQ', 'GNQ', 226, 'AF', 'https://flagcdn.com/'),
       (88, 'Greece', 'GR', 'GRC', 300, 'EU', 'https://flagcdn.com/'),
       (89, 'South Georgia and South Sandwich Islands', 'GS', 'SGS', 239, 'AN', 'https://flagcdn.com/'),
       (90, 'Guatemala', 'GT', 'GTM', 320, 'NA', 'https://flagcdn.com/'),
       (91, 'Guam', 'GU', 'GUM', 316, 'OC', 'https://flagcdn.com/'),
       (92, 'Guinea-Bissau', 'GW', 'GNB', 624, 'AF', 'https://flagcdn.com/'),
       (93, 'Guyana', 'GY', 'GUY', 328, 'SA', 'https://flagcdn.com/'),
       (94, 'Hong Kong', 'HK', 'HKG', 344, 'AS', 'https://flagcdn.com/'),
       (95, 'Heard and McDonald Islands', 'HM', 'HMD', 334, 'AN', 'https://flagcdn.com/'),
       (96, 'Honduras', 'HN', 'HND', 340, 'NA', 'https://flagcdn.com/'),
       (97, 'Croatia', 'HR', 'HRV', 191, 'EU', 'https://flagcdn.com/'),
       (98, 'Haiti', 'HT', 'HTI', 332, 'NA', 'https://flagcdn.com/'),
       (99, 'Hungary', 'HU', 'HUN', 348, 'EU', 'https://flagcdn.com/'),
       (100, 'Indonesia', 'ID', 'IDN', 360, 'AS', 'https://flagcdn.com/'),
       (101, 'Ireland', 'IE', 'IRL', 372, 'EU', 'https://flagcdn.com/'),
       (102, 'Israel', 'IL', 'ISR', 376, 'AS', 'https://flagcdn.com/'),
       (103, 'Isle of Man', 'IM', 'IMN', 833, 'EU', 'https://flagcdn.com/'),
       (104, 'India', 'IN', 'IND', 356, 'AS', 'https://flagcdn.com/'),
       (105, 'British Indian Ocean Territory', 'IO', 'IOT', 086, 'AS', 'https://flagcdn.com/'),
       (106, 'Iraq', 'IQ', 'IRQ', 368, 'AS', 'https://flagcdn.com/'),
       (107, 'Iran', 'IR', 'IRN', 364, 'AS', 'https://flagcdn.com/'),
       (108, 'Iceland', 'IS', 'ISL', 352, 'EU', 'https://flagcdn.com/'),
       (109, 'Italy', 'IT', 'ITA', 380, 'EU', 'https://flagcdn.com/'),
       (110, 'Jersey', 'JE', 'JEY', 832, 'EU', 'https://flagcdn.com/'),
       (111, 'Jamaica', 'JM', 'JAM', 388, 'NA', 'https://flagcdn.com/'),
       (112, 'Jordan', 'JO', 'JOR', 400, 'AS', 'https://flagcdn.com/'),
       (113, 'Japan', 'JP', 'JPN', 392, 'AS', 'https://flagcdn.com/'),
       (114, 'Kenya', 'KE', 'KEN', 404, 'AF', 'https://flagcdn.com/'),
       (115, 'Kyrgyzstan', 'KG', 'KGZ', 417, 'AS', 'https://flagcdn.com/'),
       (116, 'Cambodia', 'KH', 'KHM', 116, 'AS', 'https://flagcdn.com/'),
       (117, 'Kiribati', 'KI', 'KIR', 296, 'OC', 'https://flagcdn.com/'),
       (118, 'Comoros', 'KM', 'COM', 174, 'AF', 'https://flagcdn.com/'),
       (119, 'Saint Kitts and Nevis', 'KN', 'KNA', 659, 'NA', 'https://flagcdn.com/'),
       (120, 'Korea, North', 'KP', 'PRK', 408, 'AS', 'https://flagcdn.com/'),
       (121, 'Korea, South', 'KR', 'KOR', 410, 'AS', 'https://flagcdn.com/'),
       (122, 'Kuwait', 'KW', 'KWT', 414, 'AS', 'https://flagcdn.com/'),
       (123, 'Cayman Islands', 'KY', 'CYM', 136, 'NA', 'https://flagcdn.com/'),
       (124, 'Kazakhstan', 'KZ', 'KAZ', 398, 'AS', 'https://flagcdn.com/'),
       (125, 'Laos', 'LA', 'LAO', 418, 'AS', 'https://flagcdn.com/'),
       (126, 'Lebanon', 'LB', 'LBN', 422, 'AS', 'https://flagcdn.com/'),
       (127, 'Saint Lucia', 'LC', 'LCA', 662, 'NA', 'https://flagcdn.com/'),
       (128, 'Liechtenstein', 'LI', 'LIE', 438, 'EU', 'https://flagcdn.com/'),
       (129, 'Sri Lanka', 'LK', 'LKA', 144, 'AS', 'https://flagcdn.com/'),
       (130, 'Liberia', 'LR', 'LBR', 430, 'AF', 'https://flagcdn.com/'),
       (131, 'Lesotho', 'LS', 'LSO', 426, 'AF', 'https://flagcdn.com/'),
       (132, 'Lithuania', 'LT', 'LTU', 440, 'EU', 'https://flagcdn.com/'),
       (133, 'Luxembourg', 'LU', 'LUX', 442, 'EU', 'https://flagcdn.com/'),
       (134, 'Latvia', 'LV', 'LVA', 428, 'EU', 'https://flagcdn.com/'),
       (135, 'Libya', 'LY', 'LBY', 434, 'AF', 'https://flagcdn.com/'),
       (136, 'Morocco', 'MA', 'MAR', 504, 'AF', 'https://flagcdn.com/'),
       (137, 'Monaco', 'MC', 'MCO', 492, 'EU', 'https://flagcdn.com/'),
       (138, 'Moldova', 'MD', 'MDA', 498, 'EU', 'https://flagcdn.com/'),
       (139, 'Montenegro', 'ME', 'MNE', 499, 'EU', 'https://flagcdn.com/'),
       (140, 'Saint Martin (French part)', 'MF', 'MAF', 663, 'NA', 'https://flagcdn.com/'),
       (141, 'Madagascar', 'MG', 'MDG', 450, 'AF', 'https://flagcdn.com/'),
       (142, 'Marshall Islands', 'MH', 'MHL', 584, 'OC', 'https://flagcdn.com/'),
       (143, 'Macedonia', 'MK', 'MKD', 807, 'EU', 'https://flagcdn.com/'),
       (144, 'Mali', 'ML', 'MLI', 466, 'AF', 'https://flagcdn.com/'),
       (145, 'Myanmar', 'MM', 'MMR', 104, 'AS', 'https://flagcdn.com/'),
       (146, 'Mongolia', 'MN', 'MNG', 496, 'AS', 'https://flagcdn.com/'),
       (147, 'Macau', 'MO', 'MAC', 446, 'AS', 'https://flagcdn.com/'),
       (148, 'Northern Mariana Islands', 'MP', 'MNP', 580, 'OC', 'https://flagcdn.com/'),
       (149, 'Martinique', 'MQ', 'MTQ', 474, 'NA', 'https://flagcdn.com/'),
       (150, 'Mauritania', 'MR', 'MRT', 478, 'AF', 'https://flagcdn.com/'),
       (151, 'Montserrat', 'MS', 'MSR', 500, 'NA', 'https://flagcdn.com/'),
       (152, 'Malta', 'MT', 'MLT', 470, 'EU', 'https://flagcdn.com/'),
       (153, 'Mauritius', 'MU', 'MUS', 480, 'AF', 'https://flagcdn.com/'),
       (154, 'Maldives', 'MV', 'MDV', 462, 'AS', 'https://flagcdn.com/'),
       (155, 'Malawi', 'MW', 'MWI', 454, 'AF', 'https://flagcdn.com/'),
       (156, 'Mexico', 'MX', 'MEX', 484, 'NA', 'https://flagcdn.com/'),
       (157, 'Malaysia', 'MY', 'MYS', 458, 'AS', 'https://flagcdn.com/'),
       (158, 'Mozambique', 'MZ', 'MOZ', 508, 'AF', 'https://flagcdn.com/'),
       (159, 'Namibia', 'NA', 'NAM', 516, 'AF', 'https://flagcdn.com/'),
       (160, 'New Caledonia', 'NC', 'NCL', 540, 'OC', 'https://flagcdn.com/'),
       (161, 'Niger', 'NE', 'NER', 562, 'AF', 'https://flagcdn.com/'),
       (162, 'Norfolk Island', 'NF', 'NFK', 574, 'OC', 'https://flagcdn.com/'),
       (163, 'Nigeria', 'NG', 'NGA', 566, 'AF', 'https://flagcdn.com/'),
       (164, 'Nicaragua', 'NI', 'NIC', 558, 'NA', 'https://flagcdn.com/'),
       (165, 'Netherlands', 'NL', 'NLD', 528, 'EU', 'https://flagcdn.com/'),
       (166, 'Norway', 'NO', 'NOR', 578, 'EU', 'https://flagcdn.com/'),
       (167, 'Nepal', 'NP', 'NPL', 524, 'AS', 'https://flagcdn.com/'),
       (168, 'Nauru', 'NR', 'NRU', 520, 'OC', 'https://flagcdn.com/'),
       (169, 'Niue', 'NU', 'NIU', 570, 'OC', 'https://flagcdn.com/'),
       (170, 'New Zealand', 'NZ', 'NZL', 554, 'OC', 'https://flagcdn.com/'),
       (171, 'Oman', 'OM', 'OMN', 512, 'AS', 'https://flagcdn.com/'),
       (172, 'Panama', 'PA', 'PAN', 591, 'NA', 'https://flagcdn.com/'),
       (173, 'Peru', 'PE', 'PER', 604, 'SA', 'https://flagcdn.com/'),
       (174, 'French Polynesia', 'PF', 'PYF', 258, 'OC', 'https://flagcdn.com/'),
       (175, 'Papua New Guinea', 'PG', 'PNG', 598, 'OC', 'https://flagcdn.com/'),
       (176, 'Philippines', 'PH', 'PHL', 608, 'AS', 'https://flagcdn.com/'),
       (177, 'Pakistan', 'PK', 'PAK', 586, 'AS', 'https://flagcdn.com/'),
       (178, 'Poland', 'PL', 'POL', 616, 'EU', 'https://flagcdn.com/'),
       (179, 'Saint Pierre and Miquelon', 'PM', 'SPM', 666, 'NA', 'https://flagcdn.com/'),
       (180, 'Pitcairn', 'PN', 'PCN', 612, 'OC', 'https://flagcdn.com/'),
       (181, 'Puerto Rico', 'PR', 'PRI', 630, 'NA', 'https://flagcdn.com/'),
       (182, 'Palestine', 'PS', 'PSE', 275, 'AS', 'https://flagcdn.com/'),
       (183, 'Portugal', 'PT', 'PRT', 620, 'EU', 'https://flagcdn.com/'),
       (184, 'Palau', 'PW', 'PLW', 585, 'OC', 'https://flagcdn.com/'),
       (185, 'Paraguay', 'PY', 'PRY', 600, 'SA', 'https://flagcdn.com/'),
       (186, 'Qatar', 'QA', 'QAT', 634, 'AS', 'https://flagcdn.com/'),
       (187, 'Reunion', 'RE', 'REU', 638, 'AF', 'https://flagcdn.com/'),
       (188, 'Romania', 'RO', 'ROU', 642, 'EU', 'https://flagcdn.com/'),
       (189, 'Serbia', 'RS', 'SRB', 688, 'EU', 'https://flagcdn.com/'),
       (190, 'Russian Federation', 'RU', 'RUS', 643, 'EU', 'https://flagcdn.com/'),
       (191, 'Rwanda', 'RW', 'RWA', 646, 'AF', 'https://flagcdn.com/'),
       (192, 'Saudi Arabia', 'SA', 'SAU', 682, 'AS', 'https://flagcdn.com/'),
       (193, 'Solomon Islands', 'SB', 'SLB', 090, 'OC', 'https://flagcdn.com/'),
       (194, 'Seychelles', 'SC', 'SYC', 690, 'AF', 'https://flagcdn.com/'),
       (195, 'Sudan', 'SD', 'SDN', 736, 'AF', 'https://flagcdn.com/'),
       (196, 'Sweden', 'SE', 'SWE', 752, 'EU', 'https://flagcdn.com/'),
       (197, 'Singapore', 'SG', 'SGP', 702, 'AS', 'https://flagcdn.com/'),
       (198, 'Saint Helena', 'SH', 'SHN', 654, 'AF', 'https://flagcdn.com/'),
       (199, 'Slovenia', 'SI', 'SVN', 705, 'EU', 'https://flagcdn.com/'),
       (200, 'Svalbard and Jan Mayen Islands', 'SJ', 'SJM', 744, 'EU', 'https://flagcdn.com/'),
       (201, 'Slovakia', 'SK', 'SVK', 703, 'EU', 'https://flagcdn.com/'),
       (202, 'Sierra Leone', 'SL', 'SLE', 694, 'AF', 'https://flagcdn.com/'),
       (203, 'San Marino', 'SM', 'SMR', 674, 'EU', 'https://flagcdn.com/'),
       (204, 'Senegal', 'SN', 'SEN', 686, 'AF', 'https://flagcdn.com/'),
       (205, 'Somalia', 'SO', 'SOM', 706, 'AF', 'https://flagcdn.com/'),
       (206, 'Suriname', 'SR', 'SUR', 740, 'SA', 'https://flagcdn.com/'),
       (207, 'Sao Tome and Principe', 'ST', 'STP', 678, 'AF', 'https://flagcdn.com/'),
       (208, 'El Salvador', 'SV', 'SLV', 222, 'NA', 'https://flagcdn.com/'),
       (209, 'Syria', 'SY', 'SYR', 760, 'AS', 'https://flagcdn.com/'),
       (210, 'Swaziland', 'SZ', 'SWZ', 748, 'AF', 'https://flagcdn.com/'),
       (211, 'Turks and Caicos Islands', 'TC', 'TCA', 796, 'NA', 'https://flagcdn.com/'),
       (212, 'Chad', 'TD', 'TCD', 148, 'AF', 'https://flagcdn.com/'),
       (213, 'French Southern Lands', 'TF', 'ATF', 260, 'AN', 'https://flagcdn.com/'),
       (214, 'Togo', 'TG', 'TGO', 768, 'AF', 'https://flagcdn.com/'),
       (215, 'Thailand', 'TH', 'THA', 764, 'AS', 'https://flagcdn.com/'),
       (216, 'Tajikistan', 'TJ', 'TJK', 762, 'AS', 'https://flagcdn.com/'),
       (217, 'Tokelau', 'TK', 'TKL', 772, 'OC', 'https://flagcdn.com/'),
       (218, 'Timor-Leste', 'TL', 'TLS', 626, 'AS', 'https://flagcdn.com/'),
       (219, 'Turkmenistan', 'TM', 'TKM', 795, 'AS', 'https://flagcdn.com/'),
       (220, 'Tunisia', 'TN', 'TUN', 788, 'AF', 'https://flagcdn.com/'),
       (221, 'Tonga', 'TO', 'TON', 776, 'OC', 'https://flagcdn.com/'),
       (222, 'Turkey', 'TR', 'TUR', 792, 'AS', 'https://flagcdn.com/'),
       (223, 'Trinidad and Tobago', 'TT', 'TTO', 780, 'NA', 'https://flagcdn.com/'),
       (224, 'Tuvalu', 'TV', 'TUV', 798, 'OC', 'https://flagcdn.com/'),
       (225, 'Taiwan', 'TW', 'TWN', 158, 'AS', 'https://flagcdn.com/'),
       (226, 'Tanzania', 'TZ', 'TZA', 834, 'AF', 'https://flagcdn.com/'),
       (227, 'Ukraine', 'UA', 'UKR', 804, 'EU', 'https://flagcdn.com/'),
       (228, 'Uganda', 'UG', 'UGA', 800, 'AF', 'https://flagcdn.com/'),
       (229, 'United States Minor Outlying Islands', 'UM', 'UMI', 581, 'OC', 'https://flagcdn.com/'),
       (230, 'United States of America', 'US', 'USA', 840, 'NA', 'https://flagcdn.com/'),
       (231, 'Uruguay', 'UY', 'URY', 858, 'SA', 'https://flagcdn.com/'),
       (232, 'Uzbekistan', 'UZ', 'UZB', 860, 'AS', 'https://flagcdn.com/'),
       (233, 'Vatican City', 'VA', 'VAT', 336, 'EU', 'https://flagcdn.com/'),
       (234, 'Saint Vincent and the Grenadines', 'VC', 'VCT', 670, 'NA', 'https://flagcdn.com/'),
       (235, 'Venezuela', 'VE', 'VEN', 862, 'SA', 'https://flagcdn.com/'),
       (236, 'Virgin Islands, British', 'VG', 'VGB', 092, 'NA', 'https://flagcdn.com/'),
       (237, 'Virgin Islands, U.S.', 'VI', 'VIR', 850, 'NA', 'https://flagcdn.com/'),
       (238, 'Vietnam', 'VN', 'VNM', 704, 'AS', 'https://flagcdn.com/'),
       (239, 'Vanuatu', 'VU', 'VUT', 548, 'OC', 'https://flagcdn.com/'),
       (240, 'Wallis and Futuna Islands', 'WF', 'WLF', 876, 'OC', 'https://flagcdn.com/'),
       (241, 'Samoa', 'WS', 'WSM', 882, 'OC', 'https://flagcdn.com/'),
       (242, 'Yemen', 'YE', 'YEM', 887, 'AS', 'https://flagcdn.com/'),
       (243, 'Mayotte', 'YT', 'MYT', 175, 'AF', 'https://flagcdn.com/'),
       (244, 'South Africa', 'ZA', 'ZAF', 710, 'AF', 'https://flagcdn.com/'),
       (245, 'Zambia', 'ZM', 'ZMB', 894, 'AF', 'https://flagcdn.com/'),
       (246, 'Zimbabwe', 'ZW', 'ZWE', 716, 'AF', 'https://flagcdn.com/');
