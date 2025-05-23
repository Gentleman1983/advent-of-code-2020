package de.havox_design.aoc2021

import de.havox_design.aoc.utils.kotlin.helpers.AocMainClassHelper
import de.havox_design.aoc2021.day01.SonarSweep
import de.havox_design.aoc2021.day02.Dive
import de.havox_design.aoc2021.day03.BinaryDiagnostic
import de.havox_design.aoc2021.day04.GiantSquid
import de.havox_design.aoc2021.day05.HydrothermalVenture
import de.havox_design.aoc2021.day06.Laternfish
import de.havox_design.aoc2021.day07.TheTreacheryOfWhales
import de.havox_design.aoc2021.day08.SevenSegmentSearch
import de.havox_design.aoc2021.day09.SmokeBasin
import de.havox_design.aoc2021.day10.SyntaxScoring
import de.havox_design.aoc2021.day11.DumboOctopus
import de.havox_design.aoc2021.day12.PassagePathing
import de.havox_design.aoc2021.day13.TransparantOrigami
import de.havox_design.aoc2021.day14.ExtendedPolymerization
import de.havox_design.aoc2021.day15.Chiton
import de.havox_design.aoc2021.day16.PacketDecoder
import de.havox_design.aoc2021.day17.TrickShot
import de.havox_design.aoc2021.day18.Snailfish
import de.havox_design.aoc2021.day19.BeaconScanner
import de.havox_design.aoc2021.day20.TrenchMap
import de.havox_design.aoc2021.day21.DiracDice
import de.havox_design.aoc2021.day22.ReactorReboot
import de.havox_design.aoc2021.day23.Amphipod
import de.havox_design.aoc2021.day24.ArithmeticLogicUnit
import de.havox_design.aoc2021.day25.SeaCucumber

class MainClass : AocMainClassHelper {
    override fun getYear(): Int = 2021

    override fun processYear(args: Array<String>) {
        val daysSelected = args
            .any { argument -> argument.startsWith("day") }

        var day = 1
        day(
            getDayString(day),
            SonarSweep(getFileName(day))::processPart1,
            SonarSweep(getFileName(day))::processPart2,
            daysSelected,
            args
        )

        day = 2
        day(
            getDayString(day),
            Dive(getFileName(day))::processPart1,
            Dive(getFileName(day))::processPart2,
            daysSelected,
            args
        )

        day = 3
        day(
            getDayString(day),
            BinaryDiagnostic(getFileName(day))::processPart1,
            BinaryDiagnostic(getFileName(day))::processPart2,
            daysSelected,
            args
        )

        day = 4
        day(
            getDayString(day),
            GiantSquid(getFileName(day))::processPart1,
            GiantSquid(getFileName(day))::processPart2,
            daysSelected,
            args
        )

        day = 5
        day(
            getDayString(day),
            HydrothermalVenture(getFileName(day))::processPart1,
            HydrothermalVenture(getFileName(day))::processPart2,
            daysSelected,
            args
        )

        day = 6
        day(
            getDayString(day),
            Laternfish(getFileName(day))::processPart1,
            Laternfish(getFileName(day))::processPart2,
            daysSelected,
            args
        )

        day = 7
        day(
            getDayString(day),
            TheTreacheryOfWhales(getFileName(day))::processPart1,
            TheTreacheryOfWhales(getFileName(day))::processPart2,
            daysSelected,
            args
        )

        day = 8
        day(
            getDayString(day),
            SevenSegmentSearch(getFileName(day))::processPart1,
            SevenSegmentSearch(getFileName(day))::processPart2,
            daysSelected,
            args
        )

        day = 9
        day(
            getDayString(day),
            SmokeBasin(getFileName(day))::processPart1,
            SmokeBasin(getFileName(day))::processPart2,
            daysSelected,
            args
        )

        day = 10
        day(
            getDayString(day),
            SyntaxScoring(getFileName(day))::processPart1,
            SyntaxScoring(getFileName(day))::processPart2,
            daysSelected,
            args
        )

        day = 11
        day(
            getDayString(day),
            DumboOctopus(getFileName(day))::processPart1,
            DumboOctopus(getFileName(day))::processPart2,
            daysSelected,
            args
        )

        day = 12
        day(
            getDayString(day),
            PassagePathing(getFileName(day))::processPart1,
            PassagePathing(getFileName(day))::processPart2,
            daysSelected,
            args
        )

        day = 13
        day(
            getDayString(day),
            TransparantOrigami(getFileName(day))::processPart1,
            TransparantOrigami(getFileName(day))::processPart2,
            daysSelected,
            args
        )

        day = 14
        day(
            getDayString(day),
            ExtendedPolymerization(getFileName(day))::processPart1,
            ExtendedPolymerization(getFileName(day))::processPart2,
            daysSelected,
            args
        )

        day = 15
        day(
            getDayString(day),
            Chiton(getFileName(day))::processPart1,
            Chiton(getFileName(day))::processPart2,
            daysSelected,
            args
        )

        day = 16
        day(
            getDayString(day),
            PacketDecoder(getFileName(day))::processPart1,
            PacketDecoder(getFileName(day))::processPart2,
            daysSelected,
            args
        )

        day = 17
        day(
            getDayString(day),
            TrickShot(getFileName(day))::processPart1,
            TrickShot(getFileName(day))::processPart2,
            daysSelected,
            args
        )

        day = 18
        day(
            getDayString(day),
            Snailfish(getFileName(day))::processPart1,
            Snailfish(getFileName(day))::processPart2,
            daysSelected,
            args
        )

        day = 19
            day(
                getDayString(day),
                BeaconScanner(getFileName(day))::processPart1,
                BeaconScanner(getFileName(day))::processPart2,
                daysSelected,
                args
            )

        day = 20
        day(
            getDayString(day),
            TrenchMap(getFileName(day))::processPart1,
            TrenchMap(getFileName(day))::processPart2,
            daysSelected,
            args
        )

        day = 21
        day(
            getDayString(day),
            DiracDice(getFileName(day))::processPart1,
            DiracDice(getFileName(day))::processPart2,
            daysSelected,
            args
        )

        day = 22
        day(
            getDayString(day),
            ReactorReboot(getFileName(day))::processPart1,
            ReactorReboot(getFileName(day))::processPart2,
            daysSelected,
            args
        )

        if (!args.contains("testing")) {
            day = 23
            day(
                getDayString(day),
                Amphipod(getFileName(day))::processPart1,
                Amphipod(getFileName(day))::processPart2,
                daysSelected,
                args
            )
        }

        day = 24
        day(
            getDayString(day),
            ArithmeticLogicUnit(getFileName(day))::processPart1,
            ArithmeticLogicUnit(getFileName(day))::processPart2,
            daysSelected,
            args
        )

        day = 25
        day(
            getDayString(day),
            SeaCucumber(getFileName(day))::processPart1,
            SeaCucumber(getFileName(day))::processPart2,
            daysSelected,
            args
        )
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val instance = MainClass()
            instance.processYear(args)
        }
    }
}
