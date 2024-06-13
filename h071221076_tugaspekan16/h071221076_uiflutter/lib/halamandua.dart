import 'package:flutter/material.dart';

class SecondPage extends StatelessWidget {
  final List<String> imagePaths = [
    'assets/post_bunga.jpeg',
    'assets/post_satumapuluh.jpg',
    'assets/post_sisfo.jpg',
    'assets/post_ahhmantap.jpg',
    'assets/post_urra.jpg',
    'assets/post_aslab.jpg',
    'assets/post_byteminton.jpg'
  ];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Container(
              padding: const EdgeInsets.all(8.0),
              decoration: BoxDecoration(
                borderRadius: BorderRadius.circular(10),
                border: Border.all(color: Colors.grey),
              ),
              child: Row(
                children: [
                  Text('Hi, Elva - H071221076', style: TextStyle(fontSize: 24)),
                  Spacer(),
                  CircleAvatar(
                    backgroundImage: AssetImage('assets/avatar_elva.jpg'),
                  ),
                ],
              ),
            ),
            SizedBox(height: 20),
            Text('Favorit', style: TextStyle(fontSize: 18)),
            SizedBox(height: 10),
            Container(
              height: 300,
              child: ListView.builder(
                scrollDirection: Axis.horizontal,
                itemCount: imagePaths.length,
                itemBuilder: (context, index) {
                  return Container(
                    width: 200,
                    margin: EdgeInsets.only(right: 10),
                    child: ClipRRect(
                      borderRadius: BorderRadius.circular(
                          10),
                      child: Image.asset(
                        imagePaths[index],
                        fit: BoxFit
                            .cover,
                      ),
                    ),
                  );
                },
              ),
            ),
          ],
        ),
      ),
    );
  }
}
