-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 01, 2022 at 11:32 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rtp`
--

-- --------------------------------------------------------

--
-- Table structure for table `ese`
--

CREATE TABLE `ese` (
  `id` int(11) NOT NULL,
  `marks` int(11) NOT NULL,
  `sem` int(11) NOT NULL,
  `subject` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ese`
--

INSERT INTO `ese` (`id`, `marks`, `sem`, `subject`) VALUES
(2001, 40, 3, 'CAO'),
(2001, 35, 4, 'OS');

-- --------------------------------------------------------

--
-- Table structure for table `marks`
--

CREATE TABLE `marks` (
  `id` int(11) NOT NULL,
  `mse1` int(11) NOT NULL,
  `mse2` int(11) NOT NULL,
  `ta` int(11) NOT NULL,
  `sem` int(11) NOT NULL,
  `year` int(11) NOT NULL,
  `teacher` text NOT NULL,
  `subject` text NOT NULL,
  `section` char(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `marks`
--

INSERT INTO `marks` (`id`, `mse1`, `mse2`, `ta`, `sem`, `year`, `teacher`, `subject`, `section`) VALUES
(2001, 15, 15, 29, 3, 3, 'Paresh Hambarde', 'CAO', ''),
(2001, 15, 15, 30, 4, 2, 'Paresh Hambarde', 'OS', '');

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--

CREATE TABLE `registration` (
  `id` int(11) NOT NULL,
  `type` text NOT NULL,
  `name` text NOT NULL,
  `mother_name` text NOT NULL,
  `cast` text NOT NULL,
  `religion` text NOT NULL,
  `gender` text NOT NULL,
  `contact` text NOT NULL,
  `dob` text NOT NULL,
  `doa` text NOT NULL,
  `address` text NOT NULL,
  `year` int(11) NOT NULL,
  `semester` int(11) NOT NULL,
  `branch` text NOT NULL,
  `blood` text NOT NULL,
  `photo` text NOT NULL,
  `password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`id`, `type`, `name`, `mother_name`, `cast`, `religion`, `gender`, `contact`, `dob`, `doa`, `address`, `year`, `semester`, `branch`, `blood`, `photo`, `password`) VALUES
(2001, 'Student', 'Paresh V. hambarde', 'Nilima', 'brahmin', 'Hindu', 'Male', '9373432471', '18/09/2002', '23/07/2022', 'shreeram nagar', 3, 5, 'Computer Science & Engg.', 'A+', 'PHOTO.jpg', 'pass@123');

-- --------------------------------------------------------

--
-- Table structure for table `teacher_data`
--

CREATE TABLE `teacher_data` (
  `id` int(11) NOT NULL,
  `type` text NOT NULL,
  `name` text NOT NULL,
  `mother_name` text NOT NULL,
  `cast` text NOT NULL,
  `religion` text NOT NULL,
  `gender` text NOT NULL,
  `contact` text NOT NULL,
  `dob` text NOT NULL,
  `doa` text NOT NULL,
  `address` text NOT NULL,
  `year` int(11) NOT NULL,
  `semester` int(11) NOT NULL,
  `branch` text NOT NULL,
  `blood` text NOT NULL,
  `photo` text NOT NULL,
  `password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teacher_data`
--

INSERT INTO `teacher_data` (`id`, `type`, `name`, `mother_name`, `cast`, `religion`, `gender`, `contact`, `dob`, `doa`, `address`, `year`, `semester`, `branch`, `blood`, `photo`, `password`) VALUES
(1000, '', 'test', '', '', '', '', '0', '0000-00-00', '0000-00-00', '', 0, 0, '', '', '', 'pass@123'),
(1001, 'Teacher', 'Paresh Hambarde', 'Nilima', 'Brahmin', 'Hindu', 'Male', '9373432471', '18/09/2002', '23/07/2022', 'Shreeram Nagar', 3, 5, 'Computer Science & Engg.', 'A+', 'ed2.jpg', 'pass@123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `teacher_data`
--
ALTER TABLE `teacher_data`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `teacher_data`
--
ALTER TABLE `teacher_data`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1002;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
