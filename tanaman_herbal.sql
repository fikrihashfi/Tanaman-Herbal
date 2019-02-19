-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 19, 2019 at 03:27 AM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tanaman_herbal`
--

-- --------------------------------------------------------

--
-- Table structure for table `disease`
--

CREATE TABLE `disease` (
  `dNumber` varchar(25) NOT NULL,
  `name` varchar(25) NOT NULL,
  `cause` varchar(50) NOT NULL,
  `symptoms` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `disease`
--

INSERT INTO `disease` (`dNumber`, `name`, `cause`, `symptoms`) VALUES
('d1', 'Radang Tenggorokan', 'Bakteri Streptococcal', 'Iritasi pada dinding tenggorokan'),
('d10', 'Asam lambung', 'Pola makan tidak teratur', 'Sakit dada dan batuk kering tanpa henti'),
('d11', 'Tulang patah', 'Cedera atau kecelakaan', 'Ketidakmampuan menggerakkan anggota badan'),
('d12', 'Diare', 'Infeksi usus', 'Tinjanya encer'),
('d13 ', 'Demam Berdarah', 'Gigitan nyamuk Aedes Aygepty ', 'Turunnya trombosit dan demam '),
('d14', 'Flu', 'Infeksi saluran pernafasan', 'Batuk berdahak'),
('d15', 'Radang rektum', 'Infeksi bakteri salmonella dan shigella', 'Perut dan anus terasa sakit'),
('d16', 'Ambeien', 'Kurang asupan serat', 'Pendarah daerah dubur'),
('d17', 'Epilepsi', 'Keturunan atau bawaan penyakit', 'Kejang'),
('d18', 'Flek Paru-paru', 'Bakteri menular melalui batuk', 'Batuk berkepanjangan'),
('d19', 'Malaria', 'Parasit Plasmodium', 'Demam berkeringat, diare, dan nyeri otot'),
('d2', 'Sariawan', 'Kekurangan zat besi dan vitamin B12', 'Luka yang berbentuk oval di dinding mulut'),
('d20', 'Osteoporosis', 'Kekurangan kalsium', 'Perubahan postur tubuh'),
('d21', 'Tulang patah', 'keceklik', 'sakit'),
('d3', 'Sakit Kepala', 'Kurang tidur dan stress', 'Nyeri di bagian kepala'),
('d30', 'Rematik', 'Merokok dan obesitas', 'Rasa sakit akibat otot'),
('d4', 'Hipertensi', 'Kurang berolahraga', 'Sakit kepala parah, mual, dan nyeri dada'),
('d5', 'Luka bakar', 'Kontak dengan benda panas', 'Luka kemerahan dan terkadang bernanah'),
('d6', 'Disentri', 'Bakteri shigella', 'Diare, demam, dan mual'),
('d7', 'Kencing Manis', 'Pola makan salah dan stress', 'Penonjolan tulang pada kaki'),
('d8', 'Jerawat', 'Penyumbatan pori-pori oleh debu/kotoran', 'Bintik-bintik pada bagian tubuh');

-- --------------------------------------------------------

--
-- Table structure for table `herbalmedicine`
--

CREATE TABLE `herbalmedicine` (
  `hNumber` varchar(25) NOT NULL,
  `name` varchar(25) NOT NULL,
  `type` varchar(25) NOT NULL,
  `level` varchar(15) NOT NULL,
  `side effect` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `herbalmedicine`
--

INSERT INTO `herbalmedicine` (`hNumber`, `name`, `type`, `level`, `side effect`) VALUES
('d6', 'tolak angin', 'jamu jamu', '1', 'rasa kantuk'),
('m1', 'Tolak angin herbal', 'Jamu-jamuan', '3', 'membuat ngantuk'),
('m10', 'prima', 'obat minum', '3', 'tanpa efek samping'),
('M11', 'MALARIA', 'jamu jamuan', '2', 'tanpa efek samping'),
('m12', 'adem sari', 'jamu jamua', '2', 'mules'),
('m13', 'Saidan Mohamad', 'obat sirup', '3', 'tanpa efek samping'),
('m14', 'sakit kepala', 'obat bebas', '2', 'menyebabkan kantuk'),
('m15', 'burnazin', 'obat keras', '2', 'gatal di kulit'),
('m16', 'sanmetidin', 'obat keras', '3', 'efek kantuk '),
('m17', 'ace-maxs', 'obat herbal', '2', 'tanpa efek samping'),
('m18', 'verile', 'obat bebas', '2', 'gatal di kulit'),
('m19', 'aquirus pro', 'obat herbal', '2', 'tanpa efek samping'),
('m2', 'promag', 'obat perut', '3', 'diare, konstipasi'),
('m20', 'asmuratik', 'obat herbal', '2', 'tanpa efek samping'),
('m21', 'kasih sayang', 'obat', '99', 'ga tau'),
('m3', 'Jelly Gammamt QnC', 'Obat Oles', '2', 'kulit gatal'),
('m4', 'entrostop', 'obat perut', '3', 'mual, sakit perut'),
('m5', 'propolis', 'obat minum', '3', 'menyebabkan kantuk'),
('m6', 'panadol', 'obat keras', '2', 'menyebbkan kantuk'),
('m7', 'Jian Xin Capsule  ', 'obat herbal', '2', 'tanpa efek samping '),
('m8', 'ambeven ', 'obat ambien ', '3', 'rasa perih di lambung'),
('m9', 'epilepsi', 'obat herbal', '2', 'tanpa efek samping');

-- --------------------------------------------------------

--
-- Table structure for table `hmingredients`
--

CREATE TABLE `hmingredients` (
  `ingredients` varchar(25) NOT NULL,
  `hmNumber` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hmingredients`
--

INSERT INTO `hmingredients` (`ingredients`, `hmNumber`) VALUES
('Jahe, madu, kunyit ', 'm1'),
('buah manggis', 'm10'),
('buah mahoni', 'M11'),
('alang alang ', 'm12'),
('obat manggis', 'm13'),
('daun mint dan jahe ', 'm14'),
('teh ', 'm15'),
('kulit pisang', 'm16'),
('buah manggis', 'm17'),
('Andrographis paniculata ', 'm18'),
('kunyit & jahe ', 'm19'),
('madu', 'm20'),
('kunyit ', 'm2'),
('gamat emas ', 'm3'),
('daun jambu biji, kunyit', 'm4'),
('madu', 'm5'),
('jeruk nipis, madu, kunyit', 'm6'),
('gamat emas', 'm7'),
('lidah buaya ', 'm8'),
('centella asiantica', 'm9'),
('apa saja', 'd6');

-- --------------------------------------------------------

--
-- Table structure for table `medicinalplants`
--

CREATE TABLE `medicinalplants` (
  `scientificName` varchar(25) NOT NULL,
  `commonName` varchar(25) NOT NULL,
  `theUtilizePart` varchar(15) NOT NULL,
  `photo` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `medicinalplants`
--

INSERT INTO `medicinalplants` (`scientificName`, `commonName`, `theUtilizePart`, `photo`) VALUES
('Acalypha hispida Burm. f.', 'Ekor Kucing', 'Daun', ''),
('Allium sativum, Linn.', 'Bawang Putih', 'Akar', ''),
('Aloe Vera Linn.', 'Lidah buaya', 'Daun', ''),
('Ananas comosus ', 'Nanas', 'Daging buah', ''),
('Annona muricata, Linn.', 'Sirsak', 'Daun', ''),
('Averrhoa bilimbi L.', 'Belimbing wuluh', 'Daging buah', ''),
('Canangium odoratum', 'Kenanga', 'Bunga', ''),
('Carica papaya, Linn.', 'Pepaya', 'Daging buah', ''),
('Cinnamomum burmani', 'Kayu Manis', 'Kulit kayu', ''),
('Cucumis sativus L.', 'Ketimun', 'Daging buah', ''),
('Curcuma longa Linn.', 'Kunyit', 'Akar', ''),
('Dioscorea hispida Dennust', 'Gadung', 'Daun', ''),
('Homalomena occulta', 'Nampu', 'Batang', ''),
('Impatiens balsamina Linn', 'Pacar Air', 'Daun', ''),
('ini coba coba', 'counter pain', 'kulit pohon', ''),
('Nelumbium nelumbo Druce', 'Teratai', 'Akar', ''),
('Orthosiphon aristatus ', 'Kumis Kucing', 'Buah', ''),
('Phaleria macrocarpa ', 'Mahkota Dewa', 'Daun', ''),
('Piper nigrum L.', 'Lada', 'Buah', ''),
('Punica granatum L', 'Delima', 'Daging buah', ''),
('Zingeber officinale', 'Jahe', 'Akar', '');

-- --------------------------------------------------------

--
-- Table structure for table `method`
--

CREATE TABLE `method` (
  `mNumber` varchar(25) NOT NULL,
  `howToProcess` varchar(25) NOT NULL,
  `howToUse` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `method`
--

INSERT INTO `method` (`mNumber`, `howToProcess`, `howToUse`) VALUES
('e1', 'direbus dan ditumbuk ', 'diminum atau ditempelkan '),
('e10', 'dicuci kemudian diparut ', 'diminum atau ditempelkan'),
('e11', 'ditumbuk ', 'ditempelkan'),
('e12', 'dibuat infus', 'diminum'),
('e13', 'direbus', 'dikonsumsi langsung'),
('e14', 'ditumbuk', 'dikonsumsi langsung'),
('e15', 'dijuice', 'dikonsumsi langsung'),
('e16', 'dikeringkan, diseduh', 'dikonsumsi langsung'),
('e17', 'dijemur dan di rebus', 'diminum langsung'),
('e18', 'ditumbuk', 'dioleskan'),
('e19', 'direbus', 'diminum langsung'),
('e2', 'ditumbuk ', 'dioleskan '),
('e20', 'ditumbuk, direbus,diparut', 'diminum atau ditempelkan'),
('e21', 'Dibuang', 'Dimakan'),
('e3', 'bersihkan getahnya ', 'diminum,dioleskan '),
('e4', 'di olah menjadi kapsul', 'dikonsumsi langsung'),
('e5', 'diolah menjadi kapsul', 'dikonsumsi langsung'),
('e6', 'ditumbuk atau dihaluskan', 'diminum langsung'),
('e7', 'direbus dan disaring', 'diminum langsung'),
('e8', 'ditumbuk, direbus,diparut', 'dikonsumsi langsung'),
('e9', 'dipiis', 'ditempelkan');

-- --------------------------------------------------------

--
-- Table structure for table `mpcharacteristic`
--

CREATE TABLE `mpcharacteristic` (
  `cNumber` varchar(25) NOT NULL,
  `mpsName` varchar(25) NOT NULL,
  `breeding` varchar(50) NOT NULL,
  `fruit` varchar(50) NOT NULL,
  `length` varchar(15) NOT NULL,
  `leaf` varchar(50) NOT NULL,
  `flower` varchar(50) NOT NULL,
  `root` varchar(50) NOT NULL,
  `stem` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mpcharacteristic`
--

INSERT INTO `mpcharacteristic` (`cNumber`, `mpsName`, `breeding`, `fruit`, `length`, `leaf`, `flower`, `root`, `stem`) VALUES
('c1', 'Acalypha hispida Burm. f.', 'Biji', 'Monokotil berkantung yang terbuka di satu sisi', '0.9-2.7 m', 'Hijau terang dengan lebar 2.5 cm', 'Tidak sempurna (tidak berkelopak)', 'Serabut', 'Tebal dan meruncing'),
('c10', 'Cucumis sativus L.', 'Generatif ', 'Berbentuk memanjang 8-25 cm', '0.5-2.5 m', 'Berbentuk bulat dengan ujung runcing', 'Kuning berbentuk terompet', 'Serabut', 'Berwarna hijau dengan panjang 1.5 m'),
('c2', 'Allium sativum, Linn.', 'Menanamkan siung ke dalam tanah', 'Terdiri dari beberapa siung yang terpisah', '1.2 m', '12 daun/tanaman, berwarna kekuningan saat panen', 'Aseksual propagil yang berbentuk sebuah bulbil', 'Serabut', 'Struktur bawah tanah, akar & daun tumbuh dari sini'),
('c3', 'Aloe Vera Linn.', 'Menancapkan daun ke tanah', 'Tidak ada', '0.6-1 m', 'Berserat dan berduri', 'Tumbuh di pucuk daun dan berwarna kuning', 'Serabut', 'Tidak berbatang'),
('c4', 'Ananas comosus ', 'Vegetatif/tunas', 'Buah majemuk dan bentuknya bulat memanjang', '0.5-1.5 m', 'Berbentuk pita, dengan panjang sekitar 1.3-1.5 m', 'Rangkaian bunga majemuk di ujung batang', 'Serabut', 'Relatif pendek sekitar 20-30 cm'),
('c5', 'Annona muricata, Linn.', 'Biji', 'Hijau gelap dan berduri', '6-8 meter', 'Oval dengan panjang 8-10 cm', 'Pekat kekuningan ', 'Tunggang', 'Berdiameter 3-5 cm dan berambut di batang muda'),
('c6', 'Averrhoa bilimbi L.', 'Menyemai biji dan cangkok', 'Bulat, panjang 4 – 6 cm, hijau kekuningan', '5-10 m', 'Majemuk, menyirip, panjang 7–10 cm, lebar 1–3 cm', 'Majemuk, panjang 5 – 20 cm, kelopak ± 6 mm', 'Tunggang', 'Tegak, becabang-cabang, berwarna hijau kotor'),
('c7', 'Canangium odoratum', 'Biji', 'Berbentuk bulat dan panjang buah 2 cm', '2-40 m', 'Hijau gelap dan panjang sekitar 20 cm', 'Sangat harum, kuning tua saat tua', 'Tunggang', 'Berkayu, bulat, dan bercabang'),
('c8', 'Carica papaya, Linn.', 'Biji', 'Berbentuk silinder dengan panjang 50 cm', '6-9 m', 'Sangat lebar dengan panjang 50-70 cm', 'Memiliki 5 bagian dan kelopak', 'Serabut', 'Berwarna hijau dengan panjang 1.8-3 m'),
('c9', 'Cinnamomum burmani', 'Biji dan stek', 'Bulat memanjang dan berwarna hijau tua', '5-15 m', 'Tunggal, panjang 0.5-1.5 cm, dan 3 tulang daun', 'Kecil dan warna kuning', 'Serabut', 'Berdiameter 1.5-5 cm dan panjang 2-3 m');

-- --------------------------------------------------------

--
-- Table structure for table `mpclassification`
--

CREATE TABLE `mpclassification` (
  `classificationNo` varchar(25) NOT NULL,
  `mpsName` varchar(25) NOT NULL,
  `division` varchar(15) NOT NULL,
  `class` varchar(15) NOT NULL,
  `subClass` varchar(15) NOT NULL,
  `subKingdom` varchar(15) NOT NULL,
  `superDivision` varchar(15) NOT NULL,
  `species` varchar(50) NOT NULL,
  `mporder` varchar(15) NOT NULL,
  `family` varchar(15) NOT NULL,
  `genus` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mpclassification`
--

INSERT INTO `mpclassification` (`classificationNo`, `mpsName`, `division`, `class`, `subClass`, `subKingdom`, `superDivision`, `species`, `mporder`, `family`, `genus`) VALUES
('n1', 'Acalypha hispida Burm. f.', 'Magnoliophyta', 'Liliopsida', 'Commelinidae', 'Tracheobionta', 'Spermatophyta', 'Typha angustifolia L', 'Typhales', 'Typhaceae', 'Typha L.'),
('n10', 'Cucumis sativus L.', 'Magnoliophyta', 'Magnoliopsida', 'Dilleniidae', 'Tracheobionta', 'Spermatophyta', 'Cucumis sativus L. ', 'Violales', 'Cucurbitaceae', 'Cucumis L.'),
('n11', 'Curcuma longa Linn.', 'Magnoliophyta', 'Liliopsida', 'Zingiberidae', 'Tracheobionta', 'Spermatophyta', 'Curcumadomestica Val.', 'Zingiberales', 'Zingiberaceae', 'Curcuma L.'),
('n12', 'Dioscorea hispida Dennust', 'Magnoliophyta', 'Liliopsida', 'Liliida', 'Tracheobionta', 'Spermatophyta', 'Dioscorea hispida dennst', 'Liliale', 'Dioscoreaceae', 'dioscorea'),
('n13', 'Homalomena occulta', 'Magnoliophyta', 'Liliopsida', 'Arecidae', 'Tracheobionta', 'Spermatophyta', 'Alocasia cucculata (Lour.) Schoot', 'Arales', 'Araceae', 'Alocasia'),
('n14', 'Impatiens balsamina Linn', 'Tracheophyta', 'Magnoliopsida', 'Rosidae', 'Viridiplantae', 'Embryophyta', 'Impatiens balsamina', 'Ericales', 'Balsmaniceae', 'Impatiens L.'),
('n15', 'Nelumbium nelumbo Druce', 'Magnoliophyta', 'Magnoliopsida', 'Rosidae', 'Tracheobionta', 'Spermatophyta', 'Nelumbium nelumbo Linn.', 'Sapindales', 'Aceraceae', 'Nelumbium'),
('n16', 'Orthosiphon aristatus ', 'Magnoliophyta', 'Magnoliopsida', 'Asteridae', 'Tracheobionta', 'Spermatophyta', 'Orthosiphon aristatus (Blume) Miq. ', 'Lamilaes', 'Lamiaceae', 'Orthosiphon Benth. '),
('n17', 'Phaleria macrocarpa ', 'Magnoliophyta', 'Magnoliopsida', 'Rosidae', 'Tracheobionta', 'Spermatophyta', 'Phaleria macrocarpa (Scheff) Boerl.', 'Mrytales', 'Thymelaeaceae ', 'Phaleria'),
('n18', 'Piper nigrum L.', 'Magnoliophyta', 'Magnoliopsida', 'Magnoliidae', 'Tracheobionta', 'Spermatophyta', 'Piper nigrum L.', 'Piperales', 'Piperaceae', 'Piper L.'),
('n19', 'Punica granatum L', 'Magnoliophyta', 'Magnoliopsida', 'Rosidae', 'Tracheobionta', 'Spermatophyta', 'Punica granatum L.', 'Mrytales', 'Punicaceae', 'Punica L.'),
('n2', 'Allium sativum, Linn.', 'Magnoliophyta', 'Liliopsida', 'Liliidae', 'Tracheobionta', 'Spermatophyta', 'Allium aaseae Ownbey', 'Liliales', 'Liliaceae', 'Allium L.'),
('n20', 'Zingeber officinale', 'Magnoliophyta', 'Liliopsida', 'Zingiberidae', 'Tracheobionta', 'Spermatophyta', 'Zingiber officinale Roscoe ', 'Zingiberales', 'Zingiberaceae', 'Zingiber Mill.'),
('n3', 'Aloe Vera Linn.', 'Magnoliophyta', 'Liliopsida', 'Lilidae', 'Tracheobionta ', 'Spermatophyta', 'Aloe vera (L.) Burm. f.', 'Liliales', 'Aloaceae', 'Aloe L.'),
('n4', 'Ananas comosus ', 'Magnoliophyta', 'Liliopsida', 'Zingiberidae', 'Tracheobionta', 'Spermatophyta', 'Ananas comosus (L.) Merr.', 'Bromeliales', 'Bromeliaceae', 'Ananas Mill.'),
('n5', 'Annona muricata, Linn.', 'Magnoliophyta', 'Magnoliopsida', 'Magnoliidae ', 'Viridiplantae', 'Embryophyta', 'A. muricata', 'Magnoliales', 'Annonaceae', 'Annona'),
('n6', 'Averrhoa bilimbi L.', 'Magnoliophyta', 'Magnoliopsida', 'Rosidae', 'Tracheobionta', 'Spermatophyta', 'Averrhoa bilimbi L.', 'Geraniales', 'Oxalidaceae', 'Averrhoa'),
('n7', 'Canangium odoratum', 'Magnoliophyta', 'Magnoliopsida', 'Magnoliidae', 'Tracheobionta', 'Spermatophyta', 'Cananga odorata', 'Magnoliales', 'Annonaceae', 'Cananga'),
('n8', 'Carica papaya, Linn.', 'Magnoliophyta', 'Magnoliopsida', 'Dilleniidae', 'Tracheobionta', 'Spermatophyta', 'Carica papaya L.', 'Violales', 'Caricaeae', 'Carica L.'),
('n9', 'Cinnamomum burmani', 'Magnoliophyta', 'Magnoliopsida', 'Magnoliidae', 'Tracheobionta', 'Spermatophyta', 'Cinnamomum burmannii (Nees & Th. Nees)', 'Laurales', 'Lauraceae', 'Cinnamomum Schaeff'),
('n99', 'Acalypha hispida Burm. f.', 'gatau', '', '', '', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `mpcomposition`
--

CREATE TABLE `mpcomposition` (
  `composition` varchar(125) NOT NULL,
  `mpsName` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mpcomposition`
--

INSERT INTO `mpcomposition` (`composition`, `mpsName`) VALUES
('Pada daun mengandung zat acalyphin, flavonoida, saponin, dan tanin. Selain itu, pada bunga mengandung saponin dan tanin.', 'Acalypha hispida Burm. f.'),
('Mengandung Kalsium, Saltivine, Diallysulfide, Belerang, Protein, Lemak, Fosfor, Zat besi,Vitamin A, B1, dan C.', 'Allium sativum, Linn.'),
('Air: 95.23 gram\r\nProtein: 0.65 gram\r\nLemak (lipid): 0.11 gram\r\nKarbohidrat: 3.63 gram\r\nSerat: 0.5 gram\r\nGula: 1.67 gram', 'Aloe Vera Linn.'),
('Energi: 52 kal, Protein: 0,4 g,\r\nLemak: 0,2 g, Fosfor: 11 mg\r\nZat Besi: 0,3 mg, Vitamin A: 130 IU	\r\nSerat: 0,4 g, Kalsium: 16', 'Ananas comosus '),
('Kalori (cal): 65,Karbohidrat (g): 16.3\r\nProtein (g): 1.0, Lemak (g): 0.3\r\nKalsium (mg): 14.0, Besi (mg): 0.6\r\nFosfor (mg): 27', 'Annona muricata, Linn.'),
('Energi : 32 kal, Karbohidrat  : 7 g\r\nProtein : 0.4 g, Vitamin C : 52 mg\r\nKalsium : 10 mg, Fosfor : 10 mg\r\nZat Besi : 1.0 mg', 'Averrhoa bilimbi L.'),
('Flavonoida, saponin, polifenol, dan minyak atsiri', 'Canangium odoratum'),
('Vitamin A (1.750 IU), Vitamin B ( 0.03 mg), Vitamin C (56 mg), Kalsium (20 mg), Zat Besi (0.3 mg), Fosfor (16 mg)', 'Carica papaya, Linn.'),
('Energi: 24,7 kcal, Lemak: 0,12 gr\r\nKarbohidrat: 8,06 gr, Protein: 0,4 gr, minyak asiri, eugenol, safrol', 'Cinnamomum burmani'),
('Gula – 1,67 gm, Karbohidrat – 3,63 gm, Serat Diet – 0,5 gm, Vitamin B2 – 0,033 mg, Vitamin B3 – 0,098 mg', 'Cucumis sativus L.'),
('Kurkumin : R1 = R2 = OCH3 10% Demetoksikurkumin : R1 = OCH3, R2 = H 1 - 5 % Bisdemetoksikurkumin: R1 = R2 = H ', 'Curcuma longa Linn.'),
('Alkaloid dioskorina, diosgenina, saponin, furanoid norditerpena, zat pati, dan tanin\r\n', 'Dioscorea hispida Dennust'),
('Rimpang nampu mengandung saponin, flavonoid, tanin, dan polifenol. Daunnya mengandung saponin dan flavonoid.', 'Homalomena occulta'),
('Bunga :Anthocyanins, cyanidin, delphinidin, pelargonidin, malvidin, kaempherol, quercetin. Akar :Cyanidin mono-glycoside. ', 'Impatiens balsamina Linn'),
('Bunga: Quercetin, luteolin, isoquercitrin, kaempferol. Biji: raffinose, lemak, karbohidrat, kalsium, phospor dan besi.', 'Nelumbium nelumbo Druce'),
('Orthosiphon glikosida, zat samak, minyak atsiri, minyak lemak, saponin, sapofonin, garam kalium, myoinositol.', 'Orthosiphon aristatus '),
('Daun mahkota dewa mengandung antihistamin, alkaloid. Kulit buah mengandung alkaloid, dan flavonoid.', 'Phaleria macrocarpa '),
('Minyak atsiri, pinena, kariofilena, limonena, filandrena, alkaloid piperina, kavisina, zat pahit, dan minyak lemak.', 'Piper nigrum L.'),
('Kulit buah (shi liu pi) mengandung alkaloid pelletierene, granatin, betulic acid, ursolic acid, kalsium oksalat, dan pati.', 'Punica granatum L'),
('Minyak atsiri zingiberena (zingirona), zingiberol, bisabolena, kurkumen, gingerol, filandrena, dan resin pahit.', 'Zingeber officinale');

-- --------------------------------------------------------

--
-- Table structure for table `mphabitat`
--

CREATE TABLE `mphabitat` (
  `habitatNumber` varchar(25) NOT NULL,
  `mpsName` varchar(25) NOT NULL,
  `temperature` varchar(25) NOT NULL,
  `endemic` varchar(25) NOT NULL,
  `typeOfLand` varchar(25) NOT NULL,
  `typeOfSoil` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mphabitat`
--

INSERT INTO `mphabitat` (`habitatNumber`, `mpsName`, `temperature`, `endemic`, `typeOfLand`, `typeOfSoil`) VALUES
('h1', 'Acalypha hispida Burm. f.', '25', 'Hindia Barat', 'Dataran tinggi', 'Tanah Humus'),
('h10', 'Cucumis sativus L.', '23-40', 'India', 'Dataran rendah', 'Tanah Humus'),
('h2', 'Allium sativum, Linn.', '15-26', 'Asia Tengah', 'Dataran tinggi', 'Tanah Humus'),
('h3', 'Aloe Vera Linn.', '30-45', 'Afrika', 'Dataran rendah', 'Tanah Grumusol'),
('h4', 'Ananas comosus ', '24-30', 'Brazil', 'Dataran rendah', 'Tanah Entisol'),
('h5', 'Annona muricata, Linn.', '35-50', 'Karibia', 'Dataran tinggi', 'Tanah Humus'),
('h6', 'Averrhoa bilimbi L.', '34-47', 'Indonesia', 'Dataran rendah', 'Tanah Humus'),
('h7', 'Canangium odoratum', '25-30', 'Maluku dan Filipina', 'Dataran rendah', 'Tanah Entisol'),
('h8', 'Carica papaya, Linn.', '40-50', 'Amerika Tengah', 'Dataran rendah', 'Tanah Humus'),
('h9', 'Cinnamomum burmani', '35-40', 'Indonesia', 'Dataran rendah', 'Tanah Entisol');

-- --------------------------------------------------------

--
-- Table structure for table `processedby`
--

CREATE TABLE `processedby` (
  `metNumber` varchar(25) NOT NULL,
  `mpsName` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `processedby`
--

INSERT INTO `processedby` (`metNumber`, `mpsName`) VALUES
('e1', 'Acalypha hispida Burm. f.'),
('e2', 'Allium sativum, Linn.'),
('e3', 'Aloe Vera Linn.'),
('e4', 'Ananas comosus '),
('e5', 'Annona muricata, Linn.'),
('e6', 'Averrhoa bilimbi L.'),
('e7', 'Canangium odoratum'),
('e8', 'Carica papaya, Linn.'),
('e9', 'Cinnamomum burmani'),
('e10', 'Cucumis sativus L.'),
('e11', 'Curcuma longa Linn.'),
('e12', 'Dioscorea hispida Dennust'),
('e13', 'Homalomena occulta'),
('e14', 'Impatiens balsamina Linn'),
('e15', 'Nelumbium nelumbo Druce'),
('e16', 'Orthosiphon aristatus '),
('e17', 'Phaleria macrocarpa '),
('e18', 'Piper nigrum L.'),
('e19', 'Punica granatum L'),
('e20', 'Zingeber officinale'),
('e21', 'ini coba coba'),
('e20', 'ini coba coba'),
('e1', 'ini coba coba');

-- --------------------------------------------------------

--
-- Table structure for table `productresult`
--

CREATE TABLE `productresult` (
  `mpsName` varchar(25) NOT NULL,
  `hmNumber` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `productresult`
--

INSERT INTO `productresult` (`mpsName`, `hmNumber`) VALUES
('Punica granatum L', 'm1'),
('Zingeber officinale', 'm14'),
('Cucumis sativus L.', 'm17'),
('Aloe Vera Linn.', 'm15'),
('Piper nigrum L.', 'm3'),
('Dioscorea hispida Dennust', 'm17'),
('Phaleria macrocarpa ', 'm18'),
('Homalomena occulta', 'm20'),
('Ananas comosus ', 'm2'),
('Impatiens balsamina Linn', 'm3'),
('Carica papaya, Linn.', 'm4'),
('Curcuma longa Linn.', 'm13'),
('Cinnamomum burmani', 'm6'),
('Averrhoa bilimbi L.', 'm15'),
('Annona muricata, Linn.', 'm8'),
('Nelumbium nelumbo Druce', 'm19'),
('Canangium odoratum', 'M11'),
('Orthosiphon aristatus ', 'm13'),
('ini coba coba', 'm21'),
('Acalypha hispida Burm. f.', 'd6');

-- --------------------------------------------------------

--
-- Table structure for table `provenby`
--

CREATE TABLE `provenby` (
  `rdpNumber` varchar(25) NOT NULL,
  `mpsName` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `provenby`
--

INSERT INTO `provenby` (`rdpNumber`, `mpsName`) VALUES
('2302 - 2493', 'Punica granatum L'),
('1485–1515', 'Punica granatum L'),
('2302 - 2493', 'Acalypha hispida Burm. f.'),
('2337-7224', 'Nelumbium nelumbo Druce'),
('03120.1703', 'Aloe Vera Linn.'),
('03126.1798', 'Annona muricata, Linn.'),
('03220.1745', 'Averrhoa bilimbi L.'),
('3337-1354', 'Zingeber officinale'),
('04128.1930', 'Canangium odoratum'),
('04340.2017', 'Carica papaya, Linn.'),
('04569.1465', 'Ananas comosus '),
('4588-3413', 'Piper nigrum L.'),
('04950.2180', 'Orthosiphon aristatus '),
('06130.1765', 'Allium sativum, Linn.'),
('33420.1945', 'Impatiens balsamina Linn'),
('03420.1945', 'Cinnamomum burmani'),
('34240.4845', 'Phaleria macrocarpa '),
('43005.1235', 'Homalomena occulta'),
('43225.1034', 'Dioscorea hispida Dennust'),
('44440.3012', 'Cucumis sativus L.'),
('445661400', 'Curcuma longa Linn.');

-- --------------------------------------------------------

--
-- Table structure for table `rdresearcher`
--

CREATE TABLE `rdresearcher` (
  `researcher` varchar(70) NOT NULL,
  `rdpNumber` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rdresearcher`
--

INSERT INTO `rdresearcher` (`researcher`, `rdpNumber`) VALUES
('Sri Hernawati', '1485–1515'),
('Syarif Hidayatullah ', '2302 - 2493'),
('Gusti Ayu Nyoman Budiwati , Eniek Kriswiyanti', '2337-7224'),
('Indrika Utami Hayat, Edi Suryanto', '04569.1465'),
('Bimbi Putri Cahya, Christi Mambo ,Mona P. Wowor ', '06130.1765'),
('Muhartono, Indri Windarti, Hendri Busman ', '03126.1798'),
('MEGA AYU SETYAWATI', '03220.1745'),
('RINI PUJIARTI, TITIS BUDI W, KASMUDJO, SIGIT S', '04128.1930'),
('Septiani Rahayu, Ami Tjitraresmi ', '04340.2017'),
('Dian T.A, Wahyu P, Elly P', '03420.1945'),
('Kuncoro P S, Choesnan E, Lilik H, Ratna D.', '44440.3012'),
('Sri Yuni Hartati', '445661400'),
('Siwi Ratna Sumunar1, Teti Estiasih', '43225.1034'),
('MUHAMMAD SEPTIAN PURWADI', '43005.1235'),
('Wesly Pasaribu1, Sammy N.J. Longdong2, Joppy D Mudeng2', '33420.1945'),
('Luh Putu Mirah Reistriana Sari', '34240.4845'),
('NUR LAELA WAHYUNI MEILAWATI, NURLIANI BERMAWIE', '4588-3413'),
('Sidqa Hanief', '3337-1354'),
('Erwanda Desire Budiman', '04950.2180');

-- --------------------------------------------------------

--
-- Table structure for table `researchdata`
--

CREATE TABLE `researchdata` (
  `publicationNumber` varchar(25) NOT NULL,
  `mpsName` varchar(25) NOT NULL,
  `title` varchar(100) NOT NULL,
  `organization` varchar(50) NOT NULL,
  `researchTime` date NOT NULL,
  `publicationType` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `researchdata`
--

INSERT INTO `researchdata` (`publicationNumber`, `mpsName`, `title`, `organization`, `researchTime`, `publicationType`) VALUES
('03120.1703', 'Aloe Vera Linn.', 'UJI EFEK EKSTRAK DAUN LIDAH BUAYA (Aloe vera L.) TERHADAP PENYEMBUHAN LUKA INSISI KULIT', 'Univeristas Sam Ratulangi', '2015-04-01', 'JURNAL'),
('03126.1798', 'Annona muricata, Linn.', 'Ekstrak Ethanol Daun Sirsak Berpotensi Memiliki Efek Kemoterapi pada\r\nKanker Payudara Tikus Putih', 'Universitas Lampung ', '2014-08-02', 'JURNAL'),
('03220.1745', 'Averrhoa bilimbi L.', 'PEMANFAATAN EKSTRAK BUAH BELIMBING WULUH \r\nDENGAN KONSENTRASI ', 'Universitas Muhammadiyah Surakarta', '2013-03-14', 'JURNAL'),
('03420.1945', 'Cinnamomum burmani', 'Penggunaan Ekstrak Batang Kayu Manis (Cinnamomum burmannii) Terhadap Kualitas Minuman Nata de Coco', 'Universitas Muhammadiyah Malang', '2015-01-01', 'JURNAL'),
('04128.1930', 'Canangium odoratum', 'KUALITAS, KOMPOSISI KIMIA, DAN AKTIVITAS ANTIOKSIDAN\r\nMINYAK KENANGA (Cananga odorata)', 'Universitas Gadjah Mada', '2015-02-02', 'JURNAL'),
('04340.2017', 'Carica papaya, Linn.', 'REVIEW ARTIKEL: TANAMAN PEPAYA (Carica papaya L.)\r\nDAN MANFAATNYA DALAM PENGOBATAN', 'Universitas Padjadjaran', '2016-01-01', 'JURNAL'),
('04569.1465', 'Ananas comosus ', 'PENGARUH SARI BUAH NANAS (Ananas comosus TERHADAP AKTIVITAS ANTIOKSIDAN PADA EKSTRAK TONGKOL JAGUNG ', 'Universitas Sam Ratulangi', '2015-08-03', 'JURNAL'),
('04950.2180', 'Orthosiphon aristatus ', 'PENGARUH EKSTRAK DAUN KUMIS KUCING TERHADAP KONTRAKTILITAS OTOT', 'Universitas Islam Negeri', '1992-12-28', 'JURNAL'),
('06130.1765', 'Allium sativum, Linn.', 'UJI EFEK EKSTRAK UMBI BAWANG PUTIH (Allium sativum L.) TERHADAP KADAR GLUKOSA DARAH TIKUS WISTAR', 'Universitas Sam Ratulangi', '2015-01-01', 'JURNAL'),
('1485–1515', 'Punica granatum L', 'Efek ekstrak buah delima terhadap ekspresi wild p53 pada sel ganas rongga mulut', 'Universitas Jember', '2013-09-13', 'JURNAL'),
('2302 - 2493', 'Acalypha hispida Burm. f.', 'UJI ANTIBAKTERI EKSTRAK DAUN EKOR KUCING TERHADAP BAKTERI Staphylococcus aureus DAN Escherichia coli', 'Universitas Sam Ratulangi', '2015-08-03', 'JURNAL'),
('2337-7224', 'Nelumbium nelumbo Druce', 'MANFAAT TANAMAN TERATAI di DESA ADAT SUMAMPAN, KECAMATAN SUKAWATI, KABUPATEN GIANYAR, BALI', 'Universitas Udayana', '2014-03-12', 'JURNAL'),
('3337-1354', 'Zingeber officinale', 'Efektivitas Ekstrak Jahe Terhadap Pertumbuhan Bakteri Streptococcus viridans', 'Universitas Islam Negeri', '2013-09-10', 'LAPORAN'),
('33420.1945', 'Impatiens balsamina Linn', 'Efektivitas Ekstrak Daun Pacar Air Untuk Meningkatkan Respon Imun Non Spesifik Ikan Nila ', 'Universitas Sam Ratulangi', '2015-01-08', 'JURNAL'),
('34240.4845', 'Phaleria macrocarpa ', 'EFEKTIFITAS EKSTRAK DAUN MAHKOTA DEWA SEBAGAI ANTIBAKTERI TERHADAP Staphylococcus aureus', 'Universitas Mahasaraswati Denpasar', '2016-05-12', 'SKRIPSI'),
('43005.1235', 'Homalomena occulta', 'UJI EFEK ANTIPIRETIK DEKOKTA DAUN NAMPU HIJAU\r\n(Alocasia cucculata folia PADA KELINCI PUTIH', 'Universitas Muhammadiyah Surakarta', '2008-03-01', 'SKRIPSI'),
('43225.1034', 'Dioscorea hispida Dennust', 'UMBI GADUNG (Dioscorea hispida Dennst) SEBAGAI BAHAN PANGAN\r\nMENGANDUNG SENYAWA BIOAKTIF ', 'Universitas Brawijaya', '2015-01-12', 'JURNAL'),
('44440.3012', 'Cucumis sativus L.', 'PENGARUH KETIMUN SEBAGAI\r\nANTIOKSIDAN ', 'Universitas Airlangga', '2001-08-01', 'JURNAL'),
('445661400', 'Curcuma longa Linn.', 'KHASIAT KUNYIT SEBAGAI OBAT TRADISIONAL DAN MANFAAT LAINNYA ', 'Wartawan Tanaman Herbal', '2013-08-02', 'ARTIKEL'),
('4588-3413', 'Piper nigrum L.', 'Uji Aktivitas Antibakteri Ekstrak Etanol Buah Lada Hitam Terhadap Bakteri Propionibacterium acnes', 'Universitas Udayana', '2010-07-18', 'JURNAL');

-- --------------------------------------------------------

--
-- Table structure for table `treat`
--

CREATE TABLE `treat` (
  `disNumber` varchar(25) NOT NULL,
  `mpsName` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `treat`
--

INSERT INTO `treat` (`disNumber`, `mpsName`) VALUES
('d1', 'Punica granatum L'),
('d2', 'Acalypha hispida Burm. f.'),
('d3', 'Zingeber officinale'),
('d4', 'Cucumis sativus L.'),
('d5', 'Aloe Vera Linn.'),
('d6', 'Piper nigrum L.'),
('d7', 'Dioscorea hispida Dennust'),
('d8', 'Phaleria macrocarpa '),
('d30', 'Homalomena occulta'),
('d10', 'Ananas comosus '),
('d11', 'Impatiens balsamina Linn'),
('d12', 'Carica papaya, Linn.'),
('d13 ', 'Curcuma longa Linn.'),
('d14', 'Cinnamomum burmani'),
('d15', 'Averrhoa bilimbi L.'),
('d16', 'Annona muricata, Linn.'),
('d17', 'Nelumbium nelumbo Druce'),
('d18', 'Allium sativum, Linn.'),
('d19', 'Canangium odoratum'),
('d20', 'Orthosiphon aristatus '),
('d21', 'ini coba coba');

-- --------------------------------------------------------

--
-- Stand-in structure for view `view_disease`
-- (See below for the actual view)
--
CREATE TABLE `view_disease` (
`commonName` varchar(25)
,`name` varchar(25)
,`howToProcess` varchar(25)
,`howToUse` varchar(25)
);

-- --------------------------------------------------------

--
-- Structure for view `view_disease`
--
DROP TABLE IF EXISTS `view_disease`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view_disease`  AS  select `medicinalplants`.`commonName` AS `commonName`,`herbalmedicine`.`name` AS `name`,`method`.`howToProcess` AS `howToProcess`,`method`.`howToUse` AS `howToUse` from ((((((`disease` join `medicinalplants`) join `herbalmedicine`) join `method`) join `treat`) join `processedby`) join `productresult`) where ((`method`.`mNumber` = `processedby`.`metNumber`) and (`treat`.`disNumber` = `disease`.`dNumber`) and (`productresult`.`hmNumber` = `herbalmedicine`.`hNumber`) and ((`medicinalplants`.`scientificName` = `treat`.`mpsName`) = `processedby`.`mpsName`)) order by `disease`.`name` ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `disease`
--
ALTER TABLE `disease`
  ADD PRIMARY KEY (`dNumber`);

--
-- Indexes for table `herbalmedicine`
--
ALTER TABLE `herbalmedicine`
  ADD PRIMARY KEY (`hNumber`);

--
-- Indexes for table `hmingredients`
--
ALTER TABLE `hmingredients`
  ADD KEY `hmNumber` (`hmNumber`);

--
-- Indexes for table `medicinalplants`
--
ALTER TABLE `medicinalplants`
  ADD PRIMARY KEY (`scientificName`);

--
-- Indexes for table `method`
--
ALTER TABLE `method`
  ADD PRIMARY KEY (`mNumber`);

--
-- Indexes for table `mpcharacteristic`
--
ALTER TABLE `mpcharacteristic`
  ADD PRIMARY KEY (`cNumber`),
  ADD KEY `mpsName` (`mpsName`);

--
-- Indexes for table `mpclassification`
--
ALTER TABLE `mpclassification`
  ADD PRIMARY KEY (`classificationNo`),
  ADD KEY `mpsName` (`mpsName`);

--
-- Indexes for table `mpcomposition`
--
ALTER TABLE `mpcomposition`
  ADD KEY `mpsName` (`mpsName`);

--
-- Indexes for table `mphabitat`
--
ALTER TABLE `mphabitat`
  ADD PRIMARY KEY (`habitatNumber`),
  ADD KEY `mpsName` (`mpsName`);

--
-- Indexes for table `processedby`
--
ALTER TABLE `processedby`
  ADD KEY `mNumber` (`metNumber`),
  ADD KEY `mpsName` (`mpsName`);

--
-- Indexes for table `productresult`
--
ALTER TABLE `productresult`
  ADD KEY `mpsName` (`mpsName`),
  ADD KEY `hmNumber` (`hmNumber`);

--
-- Indexes for table `provenby`
--
ALTER TABLE `provenby`
  ADD KEY `rdpNumber` (`rdpNumber`),
  ADD KEY `mpsName` (`mpsName`);

--
-- Indexes for table `rdresearcher`
--
ALTER TABLE `rdresearcher`
  ADD KEY `rdpNumber` (`rdpNumber`);

--
-- Indexes for table `researchdata`
--
ALTER TABLE `researchdata`
  ADD PRIMARY KEY (`publicationNumber`),
  ADD KEY `mpscientificName` (`mpsName`);

--
-- Indexes for table `treat`
--
ALTER TABLE `treat`
  ADD KEY `dNumber` (`disNumber`),
  ADD KEY `mpsName` (`mpsName`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `hmingredients`
--
ALTER TABLE `hmingredients`
  ADD CONSTRAINT `Fhming` FOREIGN KEY (`hmNumber`) REFERENCES `herbalmedicine` (`hNumber`) ON UPDATE CASCADE;

--
-- Constraints for table `mpcharacteristic`
--
ALTER TABLE `mpcharacteristic`
  ADD CONSTRAINT `Fmpchar` FOREIGN KEY (`mpsName`) REFERENCES `medicinalplants` (`scientificName`) ON UPDATE CASCADE;

--
-- Constraints for table `mpclassification`
--
ALTER TABLE `mpclassification`
  ADD CONSTRAINT `Fmpclass` FOREIGN KEY (`mpsName`) REFERENCES `medicinalplants` (`scientificName`) ON UPDATE CASCADE;

--
-- Constraints for table `mpcomposition`
--
ALTER TABLE `mpcomposition`
  ADD CONSTRAINT `Fmpcomp` FOREIGN KEY (`mpsName`) REFERENCES `medicinalplants` (`scientificName`) ON UPDATE CASCADE;

--
-- Constraints for table `mphabitat`
--
ALTER TABLE `mphabitat`
  ADD CONSTRAINT `Fmphab` FOREIGN KEY (`mpsName`) REFERENCES `medicinalplants` (`scientificName`) ON UPDATE CASCADE;

--
-- Constraints for table `processedby`
--
ALTER TABLE `processedby`
  ADD CONSTRAINT `Fmet` FOREIGN KEY (`metNumber`) REFERENCES `method` (`mNumber`) ON UPDATE CASCADE,
  ADD CONSTRAINT `processedby_ibfk_1` FOREIGN KEY (`mpsName`) REFERENCES `medicinalplants` (`scientificName`) ON UPDATE CASCADE;

--
-- Constraints for table `productresult`
--
ALTER TABLE `productresult`
  ADD CONSTRAINT `Fhmn` FOREIGN KEY (`hmNumber`) REFERENCES `herbalmedicine` (`hNumber`) ON UPDATE CASCADE,
  ADD CONSTRAINT `Fmps` FOREIGN KEY (`mpsName`) REFERENCES `medicinalplants` (`scientificName`) ON UPDATE CASCADE;

--
-- Constraints for table `provenby`
--
ALTER TABLE `provenby`
  ADD CONSTRAINT `Fmpsc` FOREIGN KEY (`mpsName`) REFERENCES `medicinalplants` (`scientificName`) ON UPDATE CASCADE,
  ADD CONSTRAINT `Frdp` FOREIGN KEY (`rdpNumber`) REFERENCES `researchdata` (`publicationNumber`) ON UPDATE CASCADE;

--
-- Constraints for table `rdresearcher`
--
ALTER TABLE `rdresearcher`
  ADD CONSTRAINT `Frdpu` FOREIGN KEY (`rdpNumber`) REFERENCES `researchdata` (`publicationNumber`) ON UPDATE CASCADE;

--
-- Constraints for table `researchdata`
--
ALTER TABLE `researchdata`
  ADD CONSTRAINT `Fmpsci` FOREIGN KEY (`mpsName`) REFERENCES `medicinalplants` (`scientificName`) ON UPDATE CASCADE;

--
-- Constraints for table `treat`
--
ALTER TABLE `treat`
  ADD CONSTRAINT `Fdise` FOREIGN KEY (`disNumber`) REFERENCES `disease` (`dNumber`) ON UPDATE CASCADE,
  ADD CONSTRAINT `Fmpscie` FOREIGN KEY (`mpsName`) REFERENCES `medicinalplants` (`scientificName`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
