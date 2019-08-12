import kotlinx.coroutines.*
import java.io.BufferedReader
import java.io.File
import java.io.FileReader


fun main(args: Array<String>)  {
    runBlocking {
        for (i in 0 until 101) {
            // マルチスレッド処理
            GlobalScope.launch {
                val searchBr = BufferedReader(
                    FileReader(
                        File("/Users/Nakamura/IdeaProjects/AnalysisWordByWord2Vec/data/corpas/high_performance_model/model_201907_${String.format("%03d", i)}.vec"
                        )
                    )
                )
                var searchStr = searchBr.readLine()
                searchStr = searchBr.readLine()
                while (searchStr != null) {
                    println(searchStr[0])
                    searchStr = searchBr.readLine()
                }
            }
        }
        // 同期
        GlobalScope.launch {}.join()
//        delay(1000000000000)
    }
}
