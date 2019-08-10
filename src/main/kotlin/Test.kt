import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.io.BufferedReader
import java.io.File
import java.io.FileReader


fun main(args: Array<String>)  {
    runBlocking {
        launch {
            async {
                val searchBr = BufferedReader(FileReader(File("data/corpas/model_201907_001.vec")))
                var searchStr = searchBr.readLine()
                searchStr = searchBr.readLine()
                while (searchStr != null) {
                    println(searchStr)
                    searchStr = searchBr.readLine()
                }
            }
            async {
                val searchBr = BufferedReader(FileReader(File("data/corpas/model_201907_002.vec")))
                var searchStr = searchBr.readLine()
                searchStr = searchBr.readLine()
                while (searchStr != null) {
                    println(searchStr)
                    searchStr = searchBr.readLine()
                }
            }
            async {
                val searchBr = BufferedReader(FileReader(File("data/corpas/model_201907_003.vec")))
                var searchStr = searchBr.readLine()
                searchStr = searchBr.readLine()
                while (searchStr != null) {
                    println(searchStr)
                    searchStr = searchBr.readLine()
                }
            }
            async {
                val searchBr = BufferedReader(FileReader(File("data/corpas/model_201907_004.vec")))
                var searchStr = searchBr.readLine()
                searchStr = searchBr.readLine()
                while (searchStr != null) {
                    println(searchStr)
                    searchStr = searchBr.readLine()
                }
            }
            async {
                val searchBr = BufferedReader(FileReader(File("data/corpas/model_201907_005.vec")))
                var searchStr = searchBr.readLine()
                searchStr = searchBr.readLine()
                while (searchStr != null) {
                    println(searchStr)
                    searchStr = searchBr.readLine()
                }
            }
            async {
                val searchBr = BufferedReader(FileReader(File("data/corpas/model_201907_006.vec")))
                var searchStr = searchBr.readLine()
                searchStr = searchBr.readLine()
                while (searchStr != null) {
                    println(searchStr)
                    searchStr = searchBr.readLine()
                }
            }
            async {
                val searchBr = BufferedReader(FileReader(File("data/corpas/model_201907_007.vec")))
                var searchStr = searchBr.readLine()
                searchStr = searchBr.readLine()
                while (searchStr != null) {
                    println(searchStr)
                    searchStr = searchBr.readLine()
                }
            }
            async {
                val searchBr = BufferedReader(FileReader(File("data/corpas/model_201907_008.vec")))
                var searchStr = searchBr.readLine()
                searchStr = searchBr.readLine()
                while (searchStr != null) {
                    println(searchStr)
                    searchStr = searchBr.readLine()
                }
            }
            async {
                val searchBr = BufferedReader(FileReader(File("data/corpas/model_201907_009.vec")))
                var searchStr = searchBr.readLine()
                searchStr = searchBr.readLine()
                while (searchStr != null) {
                    println(searchStr)
                    searchStr = searchBr.readLine()
                }
            }
            async {
                val searchBr = BufferedReader(FileReader(File("data/corpas/model_201907_010.vec")))
                var searchStr = searchBr.readLine()
                searchStr = searchBr.readLine()
                while (searchStr != null) {
                    println(searchStr)
                    searchStr = searchBr.readLine()
                }
            }
            async {
                val searchBr = BufferedReader(FileReader(File("data/corpas/model_201907_011.vec")))
                var searchStr = searchBr.readLine()
                searchStr = searchBr.readLine()
                while (searchStr != null) {
                    println(searchStr)
                    searchStr = searchBr.readLine()
                }
            }
        }
    }
}
