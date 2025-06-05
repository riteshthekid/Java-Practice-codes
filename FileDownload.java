class FileDownload {
    public static void main(String[] args) {
        System.out.println("Main thread is running");
        InnerFileDownload innerDownload = new InnerFileDownload();
        Thread downloadThread = new Thread(() -> innerDownload.downloadFile());
        downloadThread.start();
        
        try {
            downloadThread.join();
        }
        catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        
        System.out.println("Main thread has finished running");
    }    
}

class InnerFileDownload {
    public void downloadFile() {
       for (int i = 0; i < 5; i++) {
            System.out.println("Downloading file  " + (i * 20) + "%.......");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Download interrupted");
            }
        }
        System.out.println("File download completed");
    }
}
