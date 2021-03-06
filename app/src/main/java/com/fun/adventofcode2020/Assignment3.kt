package com.`fun`.adventofcode2020

class Assignment3 {

    val input2 = listOf(
        "...#...#..#....#..#...#..##..#.",
        ".#..#.....#.#............###...",
        ".#...###....#.............##..#",
        "...##...##....#.....##..#.##...",
        ".....###.#.###..##.#.##.......#",
        "#...##.....#..........#..#.#.#.",
        "......##.......##..#....#.#....",
        "....#.###.##..#.#..##.##....#.#",
        ".......#.......###.#.#.##.....#",
        ".........#.#....#..........#.#.",
        ".#...##.....##.........#..#....",
        ".##....#.#.#...##......#.......",
        "##.#.#..#....#....#....#...#.#.",
        "##....#.#..##......#....##...#.",
        "....#..#..##..#.###.......#.#..",
        ".....##....###...........#.#.##",
        "#.....##.........#....##......#",
        "........###.#..#....#....#.....",
        "...#.......#.##..#.###......#..",
        "...............#..#....#.##....",
        "..#..###..#.#..#.........##..#.",
        "####..#..####..................",
        "#...####...#.......#.#.#...#...",
        "......###.....#......#..#..#...",
        "#...#.....##.....#.#..##...#.#.",
        "#...........##.......#.........",
        ".#..#.........#.#..##....#.....",
        "........##...#................#",
        "........#.###.#.###.#.#.##..##.",
        ".#....##.....#...##.#..#.#.....",
        "..#..#.....###....##.#....#.#.#",
        "#......##.##...##..#.........#.",
        "#..#..#.....#.....#.........#..",
        "#....#.#...###.........#...#...",
        ".#.#.....##......#.#......#....",
        "..##......##...#.#.#.#.........",
        "..#......#.....##.###.#.#..#...",
        "....#..#.......#..#..#.....#...",
        ".#.#.....#...#..........#......",
        "#.#..#...........#.#.##.#...#.#",
        "..#.#....###...#...#.....#.#...",
        "....##.#.###....####.......#...",
        ".....##....#.......#..#..#....#",
        "...##..#.#.#.#......#......#...",
        "...##...#....#...#......###...#",
        "........#..#.#.....#.###.......",
        "..#..##.#....#.#.........#...#.",
        ".....#.####....#.##.........#..",
        "......#...#...#.....#......###.",
        ".##.....#....#..#.#....#.....#.",
        "...........#...#....##..#...#..",
        ".....#....#.....#...##..#...#.#",
        ".#...#.........#.......#...#..#",
        "...#..#...#........#......#....",
        "..#..#####.#.....#.#....#...#.#",
        "...#.......#.#....#...##..#..#.",
        "####..#.#.###.#.#..............",
        ".##........#...#.#....#..#.....",
        "..#..............#.#..##...#.##",
        ".###.#.....#.#.....##.#......##",
        "....###.....#...#...#.#..#.....",
        "....###.#.##.......#....#...#..",
        "#..#...#......##..#.....#.#...#",
        "....#.#.........#..............",
        "#.##.##...#..#.#.#.....#...#.##",
        "#...#...#......#...........##..",
        "#.#.#......#............#.#....",
        ".#.#..######...#.#.........#.##",
        "..#.#..#...#......#............",
        "....#.....#......##..#.....#...",
        ".##............#....##..#......",
        ".#.#.#...#.##.............###.#",
        "#.#...#...#.....#....#.#.#.....",
        "........#..#......##.##.#.....#",
        ".....#.....#.#####...#....#....",
        ".#...#......#.........#.#......",
        "...#...#..##.....##....#..#....",
        "....#....##..#.........#.......",
        "..#........##..#.#........#....",
        "...#...##...........#...#....#.",
        ".....##.........#..#....#..#.#.",
        "#..#....##..#...##.....#..##.#.",
        "..#.#.#.#...#...#.....#.#....#.",
        ".......#.###...#.#.......#.#...",
        "....#..#..#.###.#.....###..#.#.",
        ".#..##......#..#..#....#.####..",
        "..##...........#...#.........#.",
        "......#..#...#..........#......",
        "....#..........#......##...#...",
        "....#..#.##........#.#...##.#..",
        "#.##......#........##.#...#...#",
        "#..#....#.....###........##....",
        "...........##.....##..#....#.##",
        "..#....#..#..#......#.#.....#..",
        "#....#.##....#.....##.......#..",
        ".#.....#.#..............#.##..#",
        ".#..#..#...#...#....#.#.....#..",
        "...###...##.#...#..#........#..",
        "#...#.##.#.....#.#....#..#.....",
        "#.....###.#.......#.#..#.#..##.",
        "....#..#..##.......###.#...#...",
        ".#...####...............#.....#",
        ".#.##.#.....#.....#.#......##.#",
        "#...........#.##....###.##....#",
        "...............#..........#....",
        ".....#..#.##.###.#.............",
        "...##.............#.....#.#..#.",
        "....#.#...#.#..#..#..#....#....",
        "..#.......#..........#...#...#.",
        "...............#.#.#...###....#",
        "....#...#.##....#..##....#.....",
        "........#.#.##.........##.##.##",
        "#.....###.......#.#....#..#..##",
        ".#..#...#......#.#..##.......#.",
        "#.....#.#........#.##..#..#....",
        ".###..##.#.......#......###....",
        ".#...###.....#.....#....###...#",
        "........##.##......#.#....#...#",
        ".#....#..#.........#..##...##..",
        ".......#.......##.#..#..##.....",
        "#..##..##......#.#......#.##...",
        "..#..###..#...#....#..#...#....",
        "#.............#.####.........##",
        "..#..................#...#..#..",
        "..#......#........##.......#.#.",
        ".#.#.#.#..###.....#....#.#.....",
        "...#.##.###.......#....#.......",
        "................##...#.....#...",
        "..#.###.#...#.####....#..#..#..",
        "..#....###....##..#.#.........#",
        ".#..#.#.....#........#....##...",
        ".....#..#......#..#..##.#.#....",
        ".#..#.........##....##......#..",
        ".....#.#...#...#.#...#.#...#.#.",
        "..#..#...#...#...##.#..###.....",
        "..#..##......#..##.#...##......",
        ".......#..##....##.#......#..#.",
        "..#......#.#.....#.##....##....",
        "..#....#......#......##........",
        "....##.#.#....#.......#.##.....",
        "#.....#...###....#....#...#....",
        "............#.#..#...#...#..#..",
        "..##.............##....#.......",
        ".#.......#.##.#......#....##...",
        "...##............#....#..#...#.",
        ".##.####.....#.#..###.#....#.##",
        "....##.#........#..#...#.......",
        "...#...###.##...........##..#..",
        "..##..##....#...#..#..........#",
        "..#.........#.#...##..........#",
        ".......##....#.#...##.....#..#.",
        ".............#.....#.#.......#.",
        "#.......#..##..##...##.#.......",
        "..............#.....#.#..#...##",
        "........##..#.....#...#...#.#..",
        "###.#.................#........",
        "...#........#...#.#######..#..#",
        "...#.##...##.#.#..######...#...",
        "#.......#..#....#..#.##.....#..",
        "#..#....##....#.##.......#....#",
        "#...#..#.#.#...#..#.##..#......",
        "....#..##....#..#.#...........#",
        ".##..#.#.............###.......",
        "#....##......#..#..#.....###...",
        "..#..........#...###.#.........",
        ".####......#....#......#.#....#",
        "..#....#.#.#......#....#.......",
        ".....#.....#....#....#####....#",
        ".##..........#...#.###....#....",
        "....##.....##......#...#.#.....",
        ".#...#...#..#.#.#...#####......",
        "...#.##..####.##.##.......##...",
        "............#.......#..........",
        ".#..##.#..#####........#..#...#",
        "#......##..##..##.........##...",
        "....#....#.............#.#....#",
        "###..#.....#.....#.#...#..#.###",
        "#...#.......##......#....#.#.#.",
        "...#......#..#...#....#...###.#",
        "....#....##.......#....#......#",
        "............#......##.##.....#.",
        "...#.........#......#....##..##",
        ".....##....##...#..###...#..#..",
        ".......##.#..........#.##.##...",
        "....##...........#.#..#..#.##.#",
        "#...#..##.##.#....#....#.#.....",
        "...##.#.....#..#..#..###....##.",
        "#.##.#..#..#.#.............#...",
        "..#.#.............###.....#....",
        "...#..#....#..#.....#.#..#..#..",
        "...#.....##.#...........#..##.#",
        ".........#.#.##..#..#.#...#....",
        "...#..##..#...#...###.##.#..#..",
        ".#..##...##......##..##........",
        "......##....##.#.##.#.#........",
        "...#..................#.....#..",
        ".##................#.#..#..###.",
        ".##.##.....#................#..",
        ".....#.#..........#...#..#.#..#",
        ".............#......#..#.#..#..",
        "...#...##..#........#....#.....",
        "#......#........##.##...##.....",
        "##..#..##....#...#............#",
        "..##..##.##....##..##........#.",
        "...#....#.#.#.#....#.#...##....",
        "....#...##..##.#.##...#..#...#.",
        "#..#....##.#.....#.......#...##",
        "##.#....#.............#..#.....",
        ".##..#..#.#.....#.......#.#..#.",
        ".......#..#...##...#...###..#..",
        "..........#...#.#..##.....#...#",
        "..#....#...........#####....#..",
        "#....#..#.......##.............",
        ".........##..#####.......##....",
        "#..#..........#.....###...#..#.",
        ".#.#.#..#...#.......##...#####.",
        ".....#....#.###...#.......#....",
        "#.#.....##...###....###....#...",
        ".#.....#..#.#.#........#...#...",
        ".##.#.#.#......#....###....#...",
        ".#..##..####......###......#...",
        "......#.#.#.#.#...#...####.##..",
        ".#........##..#.....#....#....#",
        ".....###......##..#....#.......",
        "#.#.##...#.#......###..........",
        "........#.#...#..#......#....#.",
        "..##...##.........#.......#.#..",
        "..#.##....#...##.....#.###.....",
        ".........#..#.#....#....#.#.##.",
        "#.........#......#..#.......#..",
        "...#...##.......#.........#....",
        "............#......#...........",
        "##.....#.....#.#...#.....#.....",
        "..#.#...#..#...#.#...........#.",
        "#.#.#..#..#...##.#...#.#.....#.",
        ".#..###.#..##.#.....#.....#....",
        "##....##....#.......##..##.....",
        ".#..#...........###..........#.",
        ".#..#..#..........###..#.......",
        "#..###......#............##...#",
        "#......#........#..#..#..#.#...",
        ".......#.###...#.##............",
        ".##....#.......#.#...##.....#.#",
        "....#..#.#.......#.#...........",
        "##....#.###.#....#.#..##.#....#",
        "..#..#..#....#...#........##...",
        "...#...##....#..#.#...#..#.....",
        "......#..#......#....#.......#.",
        "#.#..............#...###...#..#",
        "...#....#..#..........#.#...#..",
        "#.....##..##.....#........#....",
        ".#...##..#.#..............#....",
        "##.#....#..##...#..#.####.#..#.",
        ".....#.......#.#.#.#..#.....###",
        "...#.##....#.#........##.......",
        "#...#.#...#.#..###..##.##...#.#",
        "###..............#.#.###.......",
        "...###..#.#..#....##...###.#...",
        "......##...........#...#..#...#",
        ".#..#.........##.......#..#...#",
        ".#.......###......##...#...#...",
        ".#......##...#........#.......#",
        ".#..#.....#.........#.#........",
        "#...#.#.....#...#..##.........#",
        "......##.#......##.#..##.#.....",
        "...............#.#..#....#....#",
        "#....#..#..#..#.#.....##...##..",
        "#.#......#.###......#..#...####",
        ".#.#..#...#...#.#..#.##.##.#.#.",
        ".....#.#...###...#.#.....##....",
        "...#..#.#..........##.#....#.#.",
        "...#..#.#.##.....###.##.#....#.",
        "..........#..###......#..#.#...",
        "###.....#..###..#...#..###.#...",
        "..#..#.....##.#.#..###.......#.",
        "....#....##........##..........",
        ".......#..........#...#......#.",
        ".#........#.#.#.#.#.......#....",
        ".#..#.......##..##....#.#...#..",
        ".#.#.#.......#..#..............",
        "#.#....#.#...#.#.#.....#.#...##",
        ".....#..........##..#.......#..",
        ".##......#.#....#.#.......#....",
        "..#.##....#.##.#...#...........",
        "...##......##..##.............#",
        "..........##.#.#..#..........#.",
        ".##....#..#..#.#....##.#...#.#.",
        "...........#....#.....#.#..#...",
        ".#.....#....##..#.........#....",
        ".....#.....#...#....#...#.###.#",
        "..#....#....#.....#...#......#.",
        ".....##..#.............#...#...",
        "........#..#.......#.#.......#.",
        "#...###..#.##.#...###...##..##.",
        "....##..#.......#...#.#........",
        ".#...#.#.##....####........#..#",
        ".#...#.#.####.##.#.............",
        "#..##...#....#...#.#.#.#.##..#.",
        ".#.......#........#.....###....",
        "#.#.....#....#..#....#..#....#.",
        "...#..#...#.....#.........##...",
        ".#....#......###...#....#.#.#..",
        "#.#........#......#...#....##..",
        ".....#..#......#..#..#......#..",
        ".#.....#..#.##.#.#.#...#......#",
        "##........#..#.#..#...#.####...",
        "..........##....#.#..#.#....#..",
        "#.##..#..#....#..#....##..#.#.#",
        "..#......#.......#...##..#.....",
        "##...#.........#......#......#.",
        ".#.....................#..#.##.",
        ".#.......#........#.#.#..##.#..",
        "..#..........#........#..##.#..",
        ".#...#...#.........##.#.#.#....",
        "....#....#.###.#....###....#.##",
        "....##......##........##.#.##..",
        "....#.#......#.##.#...#.##.....",
        "....#....#..#.#..###.#.#.......",
        "....#......#..#.#.......#..##..",
        ".....#..#.#.##.##..##.....#.#..",
        "...#....................##.....",
        "#.....#...##...#.#.............",
        "..#.#...#.#.#.....##..#....#..."
    )

    fun count() {
        val s_1_1 = getTreesWithSlope(1, 1)
        val s_3_1 = getTreesWithSlope(3, 1)
        val s_5_1 = getTreesWithSlope(5, 1)
        val s_7_1 = getTreesWithSlope(7, 1)
        val s_1_2 = getTreesWithSlope(1, 2)

        println("total = ${s_1_1 * s_3_1 * s_5_1 * s_7_1 * s_1_2}")
    }

    private fun getTreesWithSlope(right: Int, down: Int): Long {
        var countTrees = 0L
        var cursorY = 0

        for (cursorX in 1 until input2.size step down) {
            val line = input2[cursorX]
            cursorY += right
            if (cursorY >= line.length) {
                cursorY -= line.length
            }
            if (line[cursorY] == '#') {
                countTrees++
            }
        }

        println("countTrees = $countTrees")
        return countTrees
    }

    /*
        ...#...#..#....#..#...#..##..#.
        .#..#.....#.#............###...
        .#...###....#.............##..#
        ...##...##....#.....##..#.##...
        .....###.#.###..##.#.##.......#
        #...##.....#..........#..#.#.#.
     */
}
