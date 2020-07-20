-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Waktu pembuatan: 06 Des 2018 pada 07.32
-- Versi server: 10.1.30-MariaDB
-- Versi PHP: 7.2.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `resto`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `makanan`
--

CREATE TABLE `makanan` (
  `kode_mak` varchar(25) NOT NULL,
  `nama_mak` varchar(255) NOT NULL,
  `harga_mak` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `makanan`
--

INSERT INTO `makanan` (`kode_mak`, `nama_mak`, `harga_mak`) VALUES
(' ', '  ', 0),
('MAK01', 'Tempura', 25000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `minum`
--

CREATE TABLE `minum` (
  `kode_min` varchar(50) NOT NULL,
  `nama_min` varchar(255) NOT NULL,
  `harga_min` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `minum`
--

INSERT INTO `minum` (`kode_min`, `nama_min`, `harga_min`) VALUES
('min1', 'Coca Cola', 8000),
('min2', 'Ocha', 15000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pemesanan`
--

CREATE TABLE `pemesanan` (
  `kode_pesan` varchar(25) NOT NULL,
  `nama_pemesan` varchar(60) NOT NULL,
  `meja` int(10) NOT NULL,
  `makanan1` varchar(50) NOT NULL,
  `jumlahmak1` int(25) NOT NULL,
  `makanan2` varchar(50) NOT NULL,
  `jumlahmak2` int(25) NOT NULL,
  `minuman1` varchar(50) NOT NULL,
  `jumlahmin1` int(25) NOT NULL,
  `minuman2` varchar(50) NOT NULL,
  `jumlahmin2` int(25) NOT NULL,
  `TotalHarga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pemesanan`
--

INSERT INTO `pemesanan` (`kode_pesan`, `nama_pemesan`, `meja`, `makanan1`, `jumlahmak1`, `makanan2`, `jumlahmak2`, `minuman1`, `jumlahmin1`, `minuman2`, `jumlahmin2`, `TotalHarga`) VALUES
('JPR001', '1', 0, 'coba', 1, 'coba', 3, 'coba', 2, 'coba', 3, 3000),
('JPR002', 'wAhyu', 1, 'Tempura', 1, 'Tempura', 1, 'Coca Cola', 1, 'Coca Cola', 1, 66000),
('JPR003', 'raihan', 1, 'Tempura', 3, 'Tempura', 3, 'Ocha', 3, 'Coca Cola', 4, 227000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pesan`
--

CREATE TABLE `pesan` (
  `kode_pesanan` varchar(25) NOT NULL,
  `no_meja` int(25) NOT NULL,
  `kode_mak` int(50) NOT NULL,
  `kode_min` int(50) NOT NULL,
  `nama_pemesan` varchar(255) NOT NULL,
  `total_bayar` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `makanan`
--
ALTER TABLE `makanan`
  ADD PRIMARY KEY (`kode_mak`);

--
-- Indeks untuk tabel `minum`
--
ALTER TABLE `minum`
  ADD PRIMARY KEY (`kode_min`);

--
-- Indeks untuk tabel `pesan`
--
ALTER TABLE `pesan`
  ADD KEY `kode_min` (`kode_min`),
  ADD KEY `kode_mak` (`kode_mak`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
