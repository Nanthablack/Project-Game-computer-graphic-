import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;

class MyCanvas extends JComponent {

    public void paintComponent(Graphics paint) {

        paint.setColor(Color.pink);
        paint.fillRect(0, 0, 600, 600);
        paint.setColor(Color.black); // 
        paint.fillRect(0, 0, 600, 71); //
        paint.fillRect(0, 0, 105, 600); // 
        paint.fillRect(0, 527, 600, 73); // 
        paint.fillRect(504, 0, 96, 600); //
        paint.fillRect(430, 0, 600, 400);
        paint.setColor(Color.black);
        // 
        // 
        paint.fillRect(105, 71, 191 - 105, 370 - 71);
        paint.fillRect(191, 71, 314 - 191, 89 - 71);
        paint.fillRect(335, 71, 373 - 335, 141 - 71);
        paint.fillRect(373, 71, 504 - 373, 275 - 71);

        paint.fillRect(349, 141, 373 - 349, 187 - 141);

        paint.fillRect(401, 275, 434 - 401, 300 - 275);
        paint.fillRect(434, 275, 504 - 434, 308 - 275);

        paint.fillRect(191, 322, 288 - 191, 364 - 322);

        paint.fillRect(237, 281, 299 - 237, 322 - 281);
        paint.fillRect(287, 322, 304 - 287, 355 - 322);
        // -------------------------------
        // R
        // ----------------------------------------
        // r1
        paint.fillRect(105, 370, 131 - 105, 410 - 370);
        paint.fillRect(131, 370, 149 - 131, 389 - 370);
        paint.fillRect(105, 410, 123 - 105, 421 - 410);
        // r2
        paint.fillRect(105, 449, 120 - 105, 482 - 449);
        paint.fillRect(120, 471, 136 - 120, 482 - 471);
        // r3
        paint.fillRect(167, 380, 172 - 167, 391 - 380);
        paint.fillRect(167, 391, 202 - 167, 400 - 391);
        paint.fillRect(202, 392, 216 - 202, 400 - 392);
        paint.fillRect(165, 400, 216 - 165, 420 - 400);
        paint.fillRect(161, 420, 218 - 161, 455 - 420);
        paint.fillRect(147, 455, 223 - 147, 482 - 455);
        paint.fillRect(223, 462, 258 - 223, 482 - 462);
        paint.fillRect(258, 468, 264 - 258, 482 - 468);
        paint.fillRect(264, 471, 266 - 264, 482 - 471);
        // r4
        paint.fillRect(268, 373, 303 - 268, 436 - 373);
        paint.fillRect(269, 390, 297 - 269, 446 - 390);
        paint.fillRect(297, 436, 301 - 297, 443 - 436);
        paint.fillRect(282, 370, 291 - 282, 373 - 370);
        paint.fillRect(291, 368, 303 - 291, 373 - 368);
        // r5
        paint.fillRect(303, 363, 315 - 303, 425 - 363);
        paint.fillRect(315, 351, 327 - 315, 407 - 351);
        paint.fillRect(327, 337, 339 - 327, 390 - 337);
        paint.fillRect(339, 337, 349 - 339, 376 - 337);
        paint.fillRect(334, 318, 349 - 334, 337 - 318);
        paint.fillRect(312, 300, 349 - 312, 318 - 300);
        paint.fillRect(320, 278, 342 - 320, 300 - 278);
        paint.fillRect(336, 261, 348 - 336, 278 - 261);
        paint.fillRect(348, 257, 353 - 348, 271 - 257);

        paint.fillRect(353, 250, 356 - 353, 266 - 250);
        paint.fillRect(356, 250, 359 - 356, 262 - 250);
        paint.fillRect(359, 243, 362 - 359, 258 - 243);
        paint.fillRect(362, 243, 373 - 362, 254 - 243);

        // r6
        paint.fillRect(349, 294, 366 - 349, 352 - 294);
        paint.fillRect(357, 275, 366 - 357, 281 - 275);
        paint.fillRect(355, 281, 366 - 355, 287 - 281);
        paint.fillRect(352, 287, 366 - 352, 294 - 287);
        paint.fillRect(366, 308, 397 - 366, 317 - 308);
        paint.fillRect(366, 317, 391 - 366, 323 - 317);
        paint.fillRect(366, 323, 377 - 366, 340 - 323);
        // ---------------------------
        // Q
        // ---------------------------
        // Q1
        paint.fillRect(284, 273, 307 - 284, 281 - 273);
        paint.fillRect(288, 267, 315 - 288, 273 - 267);
        paint.fillRect(292, 262, 324 - 292, 267 - 262);
        paint.fillRect(299, 252, 330 - 299, 262 - 252);
        paint.fillRect(310, 250, 333 - 310, 255 - 250);

        paint.fillRect(317, 245, 336 - 317, 250 - 245);
        paint.fillRect(325, 237, 339 - 325, 245 - 237);
        paint.fillRect(328, 232, 342 - 328, 237 - 232);
        paint.fillRect(330, 227, 344 - 330, 232 - 227);
        paint.fillRect(331, 217, 347 - 331, 227 - 217);

        paint.fillRect(310, 217, 319 - 310, 220 - 217);
        paint.fillRect(319, 217, 324 - 319, 222 - 217);
        paint.fillRect(320, 214, 327 - 320, 217 - 214);
        paint.fillRect(327, 199, 341 - 327, 217 - 199);
        paint.fillRect(341, 207, 351 - 341, 217 - 207);
        paint.fillRect(341, 187, 362 - 341, 207 - 187);
        // Q2
        paint.fillRect(217, 254, 229 - 217, 258 - 254);
        paint.fillRect(229, 252, 237 - 229, 261 - 252);
        paint.fillRect(237, 254, 278 - 237, 268 - 254);
        paint.fillRect(272, 244, 285 - 272, 254 - 244);
        paint.fillRect(285, 244, 289 - 285, 250 - 244);
        // -----------------------------------
        // Q3
        paint.fillRect(208, 218, 220 - 208, 220 - 218);
        paint.fillRect(209, 220, 223 - 209, 223 - 220);
        paint.fillRect(210, 223, 226 - 210, 232 - 223);
        paint.fillRect(213, 232, 223 - 213, 240 - 232);
        // -----------------------------------
        // Q4
        paint.fillRect(211, 176, 214 - 211, 182 - 176);
        paint.fillRect(214, 180, 220 - 214, 188 - 180);
        paint.fillRect(220, 180, 229 - 220, 193 - 180);
        paint.fillRect(229, 180, 238 - 229, 199 - 180);

        paint.fillRect(238, 173, 255 - 238, 199 - 173);
        paint.fillRect(240, 199, 247 - 240, 214 - 199);
        paint.fillRect(245, 214, 249 - 245, 241 - 214);

        paint.fillRect(255, 173, 267 - 255, 188 - 173);
        paint.fillRect(267, 173, 274 - 267, 180 - 173);

        paint.fillRect(245, 165, 278 - 245, 173 - 165);
        paint.fillRect(245, 153, 281 - 245, 165 - 153);
        paint.fillRect(245, 144, 284 - 245, 153 - 144);
        paint.fillRect(263, 135, 284 - 263, 144 - 135);
        paint.fillRect(274, 130, 284 - 274, 135 - 130);

        // -----------------------------------
        // Q5
        paint.fillRect(293, 162, 298 - 293, 174 - 162);
        paint.fillRect(295, 153, 302 - 295, 162 - 153);
        paint.fillRect(297, 137, 307 - 297, 153 - 137);
        paint.fillRect(297, 127, 310 - 297, 137 - 127);
        // -----------------------------------
        // Q6
        paint.fillRect(269, 215, 285 - 269, 232 - 215);
        paint.fillRect(285, 218, 290 - 285, 229 - 218);
        paint.fillRect(285, 201, 295 - 285, 218 - 201);
        paint.fillRect(295, 192, 300 - 295, 214 - 192);

        paint.fillRect(300, 186, 304 - 300, 211 - 186);
        paint.fillRect(306, 199, 317 - 306, 206 - 199);
        paint.fillRect(304, 184, 306 - 304, 211 - 184);

        paint.fillRect(304, 184, 330 - 304, 199 - 184);
        paint.fillRect(306, 177, 334 - 306, 184 - 177);
        paint.fillRect(309, 172, 335 - 309, 177 - 172);
        paint.fillRect(310, 168, 337 - 310, 172 - 168);
        paint.fillRect(310, 164, 338 - 310, 168 - 164);
        paint.fillRect(317, 141, 340 - 317, 164 - 141);
        // -----------------------------------

        // ล่าง
        paint.fillRect(332, 445, 388 - 332, 482 - 445);
        paint.fillRect(367, 402, 388 - 367, 445 - 402);
        paint.fillRect(105, 482, 267 - 105, 527 - 482);
        paint.fillRect(291, 482, 388 - 291, 527 - 482);
        paint.fillRect(388, 382, 504 - 388, 527 - 382);

        // ----------------

        paint.setColor(Color.black);

        // ----- A1
        paint.fillRect(190, 89, 313 - 190, 1);
        paint.fillRect(190, 90, 277 - 190, 1);
        paint.fillRect(190, 91, 271 - 190, 1);
        paint.fillRect(190, 92, 266 - 190, 1);
        paint.fillRect(190, 93, 255 - 190, 1);

        paint.fillRect(190, 94, 255 - 190, 1);
        paint.fillRect(190, 95, 252 - 190, 1);
        paint.fillRect(190, 96, 247 - 190, 1);
        paint.fillRect(190, 97, 245 - 190, 1);
        paint.fillRect(190, 98, 242 - 190, 1);

        paint.fillRect(190, 99, 196 - 190, 1);
        paint.fillRect(190, 100, 196 - 190, 1);

        paint.fillRect(190, 101, 195 - 190, 1);
        paint.fillRect(190, 102, 195 - 190, 1);
        paint.fillRect(190, 103, 195 - 190, 1);
        paint.fillRect(190, 104, 195 - 190, 1);
        paint.fillRect(190, 105, 195 - 190, 1);
        paint.fillRect(190, 106, 195 - 190, 1);
        paint.fillRect(190, 107, 195 - 190, 1);
        int a = 108;
        for (int i = 0; i < 30; i++) {
            paint.fillRect(190, a, 4, 1);
            a++;
        }
        // ------------------------------
        int b = 139;
        for (int i = 0; i < 17; i++) {
            paint.fillRect(190, b, 3, 1);
            b++;
        }
        int c = 156;
        for (int i = 0; i < 23; i++) {
            paint.fillRect(190, c, 2, 1);
            c++;
        }
        int d = 179;
        for (int i = 0; i < 52; i++) {
            paint.fillRect(190, d, 1, 1);
            d++;
        }
        // -------------------- A
        paint.fillRect(190, 231, 2, 1);
        paint.fillRect(190, 232, 2, 1);
        paint.fillRect(190, 233, 2, 1);
        paint.fillRect(190, 234, 2, 1);
        paint.fillRect(190, 235, 2, 1);
        paint.fillRect(190, 236, 2, 1);

        paint.fillRect(190, 237, 3, 1);
        paint.fillRect(190, 238, 3, 1);
        paint.fillRect(190, 239, 3, 1);

        paint.fillRect(190, 240, 4, 1);
        paint.fillRect(190, 241, 4, 1);
        paint.fillRect(190, 242, 4, 1);

        paint.fillRect(190, 243, 5, 1);
        paint.fillRect(190, 244, 5, 1);
        paint.fillRect(190, 245, 5, 1);
        paint.fillRect(190, 246, 5, 1);
        paint.fillRect(190, 247, 5, 1);
        paint.fillRect(190, 248, 5, 1);

        paint.fillRect(190, 249, 6, 1);
        paint.fillRect(190, 250, 6, 1);
        paint.fillRect(190, 251, 6, 1);

        paint.fillRect(190, 252, 7, 1);
        paint.fillRect(190, 253, 7, 1);

        paint.fillRect(190, 254, 8, 1);

        paint.fillRect(190, 255, 9, 1);
        paint.fillRect(190, 256, 9, 1);
        paint.fillRect(190, 257, 9, 1);
        // A02
        paint.fillRect(190, 258, 10, 1);
        paint.fillRect(190, 259, 10, 1);
        paint.fillRect(190, 260, 10, 1);
        paint.fillRect(190, 261, 10, 1);

        paint.fillRect(190, 262, 11, 1);
        paint.fillRect(190, 263, 11, 1);

        paint.fillRect(190, 264, 202 - 190, 1);
        paint.fillRect(190, 265, 202 - 190, 1);

        paint.fillRect(190, 266, 203 - 190, 1);
        paint.fillRect(190, 267, 203 - 190, 1);
        paint.fillRect(190, 268, 203 - 190, 1);

        paint.fillRect(190, 269, 204 - 190, 1);
        paint.fillRect(190, 270, 204 - 190, 1);
        paint.fillRect(190, 271, 204 - 190, 1);
        paint.fillRect(190, 272, 204 - 190, 1);

        paint.fillRect(190, 273, 205 - 190, 1);
        paint.fillRect(190, 274, 205 - 190, 1);
        paint.fillRect(190, 275, 206 - 190, 1);
        paint.fillRect(190, 276, 206 - 190, 1);

        paint.fillRect(190, 277, 207 - 190, 1);

        paint.fillRect(190, 278, 208 - 190, 1);
        paint.fillRect(190, 279, 208 - 190, 1);

        paint.fillRect(190, 280, 209 - 190, 1);
        paint.fillRect(190, 281, 209 - 190, 1);

        paint.fillRect(190, 282, 210 - 190, 1);
        paint.fillRect(190, 283, 210 - 190, 1);

        paint.fillRect(190, 284, 211 - 190, 1);
        paint.fillRect(190, 285, 211 - 190, 1);

        paint.fillRect(190, 286, 212 - 190, 1);
        paint.fillRect(190, 287, 212 - 190, 1);

        // A03
        paint.fillRect(190, 288, 213 - 190, 1);
        paint.fillRect(190, 289, 213 - 190, 1);

        paint.fillRect(190, 290, 214 - 190, 1);

        paint.fillRect(190, 291, 215 - 190, 1);
        paint.fillRect(190, 292, 215 - 190, 1);
        paint.fillRect(190, 293, 215 - 190, 1);

        paint.fillRect(190, 294, 216 - 190, 1);

        paint.fillRect(190, 295, 217 - 190, 1);

        paint.fillRect(190, 296, 218 - 190, 1);
        paint.fillRect(190, 297, 218 - 190, 1);
        paint.fillRect(190, 298, 218 - 190, 1);

        paint.fillRect(190, 299, 219 - 190, 1);
        paint.fillRect(190, 300, 219 - 190, 1);
        paint.fillRect(190, 301, 220 - 190, 1);
        paint.fillRect(190, 302, 220 - 190, 1);

        paint.fillRect(190, 303, 221 - 190, 1);
        paint.fillRect(190, 304, 222 - 190, 1);
        paint.fillRect(190, 305, 222 - 190, 1);

        paint.fillRect(190, 306, 223 - 190, 1);

        paint.fillRect(190, 307, 224 - 190, 1);
        paint.fillRect(190, 308, 224 - 190, 1);

        paint.fillRect(190, 309, 225 - 190, 1);

        paint.fillRect(190, 310, 226 - 190, 1);
        paint.fillRect(190, 311, 226 - 190, 1);

        paint.fillRect(190, 312, 227 - 190, 1);
        paint.fillRect(190, 313, 227 - 190, 1);
        paint.fillRect(190, 314, 228 - 190, 1);

        paint.fillRect(190, 315, 229 - 190, 1);

        paint.fillRect(190, 316, 230 - 190, 1);

        paint.fillRect(190, 317, 231 - 190, 1);

        paint.fillRect(190, 318, 232 - 190, 1);
        paint.fillRect(190, 319, 233 - 190, 1);

        paint.fillRect(190, 320, 234 - 190, 1);

        paint.fillRect(190, 321, 236 - 190, 1);
        // --------------------------------------------------------------------------------------------------------------------------------------
        paint.setColor(Color.black);
        paint.fillRect(190, 99, 196 - 190, 1);

        paint.fillRect(198, 99, 240 - 198, 1);

        paint.fillRect(200, 100, 238 - 200, 1);
        paint.fillRect(200, 101, 236 - 200, 1);

        paint.fillRect(201, 102, 233 - 201, 1);
        paint.fillRect(201, 103, 231 - 201, 1);
        paint.fillRect(201, 104, 228 - 201, 1);
        paint.fillRect(201, 105, 226 - 201, 1);
        paint.fillRect(201, 106, 225 - 201, 1);
        paint.fillRect(201, 107, 224 - 201, 1);
        paint.fillRect(201, 108, 222 - 201, 1);
        paint.fillRect(201, 109, 221 - 201, 1);
        paint.fillRect(201, 110, 219 - 201, 1);
        paint.fillRect(201, 111, 217 - 201, 1);
        paint.fillRect(201, 112, 215 - 201, 1);
        paint.fillRect(201, 113, 213 - 201, 1);
        paint.fillRect(201, 114, 212 - 201, 1);
        paint.fillRect(201, 115, 211 - 201, 1);
        paint.fillRect(201, 116, 210 - 201, 1);
        paint.fillRect(201, 117, 209 - 201, 1);
        paint.fillRect(201, 118, 208 - 201, 1);

        paint.fillRect(202, 119, 206 - 202, 1);
        paint.fillRect(202, 120, 205 - 202, 1);
        paint.fillRect(202, 121, 205 - 202, 1);
        paint.fillRect(203, 122, 204 - 203, 1);

        // หู
        paint.fillRect(190, 89, 313 - 190, 1);

        paint.fillRect(313, 89, 314 - 313, 1);
        paint.fillRect(313, 88, 315 - 313, 1);

        paint.fillRect(313, 87, 315 - 313, 1);
        paint.fillRect(313, 86, 316 - 313, 1);

        paint.fillRect(313, 85, 317 - 313, 1);
        paint.fillRect(313, 84, 318 - 313, 1);

        paint.fillRect(313, 83, 319 - 313, 1);
        paint.fillRect(313, 82, 320 - 313, 1);

        paint.fillRect(313, 81, 321 - 313, 1);
        paint.fillRect(313, 80, 322 - 313, 1);

        paint.fillRect(313, 79, 323 - 313, 1);
        paint.fillRect(313, 78, 324 - 313, 1);

        paint.fillRect(313, 77, 325 - 313, 1);
        paint.fillRect(313, 76, 326 - 313, 1);

        paint.fillRect(313, 75, 327 - 313, 1);
        paint.fillRect(313, 74, 328 - 313, 1);

        paint.fillRect(313, 73, 329 - 313, 1);

        paint.fillRect(313, 72, 333 - 313, 1);
        paint.fillRect(313, 71, 334 - 313, 1);

     
        // 1
        paint.fillRect(209, 262, 223 - 209, 1);
        paint.fillRect(207, 263, 224 - 207, 1);
        paint.fillRect(207, 264, 224 - 207, 1);
        paint.fillRect(207, 265, 226 - 207, 1);

        paint.fillRect(207, 266, 227 - 207, 1);
        paint.fillRect(208, 267, 228 - 208, 1);
        paint.fillRect(209, 268, 229 - 209, 1);
        paint.fillRect(209, 269, 230 - 209, 1);

        paint.fillRect(209, 270, 230 - 209, 1);
        paint.fillRect(209, 271, 230 - 209, 1);
        paint.fillRect(210, 272, 230 - 210, 1);
        paint.fillRect(210, 273, 231 - 210, 1);

        paint.fillRect(211, 274, 231 - 211, 1);
        paint.fillRect(212, 275, 232 - 212, 1);
        paint.fillRect(212, 276, 232 - 212, 1);
        paint.fillRect(212, 277, 233 - 212, 1);
        // 5
        paint.fillRect(213, 278, 233 - 213, 1);
        paint.fillRect(213, 279, 235 - 213, 1);
        paint.fillRect(214, 280, 237 - 214, 1);
        paint.fillRect(215, 281, 237 - 215, 1);

        paint.fillRect(215, 282, 237 - 215, 1);
        paint.fillRect(216, 283, 237 - 216, 1);
        paint.fillRect(219, 284, 237 - 219, 1);
        paint.fillRect(220, 285, 237 - 220, 1);

        paint.drawLine(221, 286, 237, 286);
        paint.drawLine(222, 287, 237, 287);
        paint.drawLine(223, 288, 237, 288);
        paint.drawLine(224, 289, 237, 289);

        paint.drawLine(225, 290, 237, 290);
        paint.drawLine(226, 291, 237, 291);
        paint.drawLine(226, 292, 237, 292);
        paint.drawLine(227, 293, 237, 293);
        // 9
        paint.drawLine(228, 294, 237, 294);
        paint.drawLine(228, 295, 237, 295);
        paint.drawLine(229, 296, 237, 296);
        paint.drawLine(229, 297, 237, 297);

        paint.drawLine(230, 298, 237, 298);
        paint.drawLine(230, 299, 237, 299);
        paint.drawLine(231, 300, 237, 300);
        paint.drawLine(231, 301, 237, 301);

        paint.drawLine(232, 302, 237, 302);
        paint.drawLine(232, 303, 237, 303);
        paint.drawLine(232, 304, 237, 304);
        paint.drawLine(233, 305, 237, 305);

        paint.drawLine(233, 306, 237, 306);
        paint.drawLine(234, 307, 237, 307);
        paint.drawLine(235, 308, 237, 308);
        paint.drawLine(236, 309, 237, 309);

        paint.drawLine(236, 310, 237, 310);
        paint.drawLine(236, 311, 237, 311);
        // -------------------------------

        // คิ้ว
        paint.drawLine(200, 186, 202, 186);
        paint.drawLine(200, 187, 203, 187);
        paint.drawLine(199, 188, 203, 188);
        paint.drawLine(198, 189, 203, 189);

        paint.drawLine(198, 190, 203, 190);
        paint.drawLine(198, 191, 204, 191);
        paint.drawLine(198, 192, 204, 192);
        paint.drawLine(198, 193, 205, 193);

        paint.drawLine(198, 194, 205, 194);
        paint.drawLine(198, 195, 206, 195);
        paint.drawLine(198, 196, 207, 196);
        paint.drawLine(200, 197, 209, 197);

        paint.drawLine(202, 198, 210, 198);
        paint.drawLine(203, 199, 211, 199);
        paint.drawLine(205, 200, 212, 200);
        paint.drawLine(207, 201, 213, 201);
        // 5
        paint.drawLine(208, 202, 215, 202);
        paint.drawLine(210, 203, 216, 203);
        paint.drawLine(211, 204, 219, 204);
        paint.drawLine(212, 205, 220, 205);

        paint.drawLine(214, 206, 222, 206);
        paint.drawLine(215, 207, 224, 207);
        paint.drawLine(216, 208, 226, 208);
        paint.drawLine(217, 209, 227, 209);

        paint.drawLine(219, 210, 230, 210);
        paint.drawLine(221, 211, 231, 211);
        paint.drawLine(222, 212, 231, 212);
        paint.drawLine(223, 213, 231, 213);

        paint.drawLine(224, 214, 231, 214);
        paint.drawLine(225, 215, 231, 215);
        paint.drawLine(226, 216, 231, 216);
        paint.drawLine(227, 217, 231, 217);

        paint.drawLine(229, 218, 231, 218);

        // -------------------------------

        // 
        paint.drawLine(199, 206, 202, 206);
        paint.drawLine(198, 207, 203, 207);
        paint.drawLine(198, 208, 204, 208);
        paint.drawLine(198, 209, 205, 209);

        paint.drawLine(198, 210, 207, 210);
        paint.drawLine(199, 211, 208, 211);
        paint.drawLine(199, 212, 210, 212);
        paint.drawLine(200, 213, 213, 213);

        paint.drawLine(201, 214, 214, 214);
        paint.drawLine(202, 215, 215, 215);
        paint.drawLine(203, 216, 218, 216);
        paint.drawLine(204, 217, 219, 217);

        paint.drawLine(204, 218, 221, 218);
        paint.drawLine(204, 219, 222, 219);
        paint.drawLine(205, 220, 223, 220);
        paint.drawLine(205, 221, 225, 221);
        // 5
        paint.drawLine(206, 222, 225, 222);
        paint.drawLine(206, 223, 225, 223);
        paint.drawLine(206, 224, 226, 224);
        paint.drawLine(206, 225, 226, 225);

        paint.drawLine(206, 226, 226, 226);
        paint.drawLine(205, 227, 226, 227);
        paint.drawLine(204, 228, 226, 228);
        paint.drawLine(204, 229, 227, 229);

        paint.drawLine(204, 230, 227, 230);
        paint.drawLine(205, 231, 228, 231);
        paint.drawLine(206, 232, 228, 232);
        paint.drawLine(208, 233, 228, 233);

        paint.drawLine(208, 234, 228, 234);
        paint.drawLine(207, 235, 228, 235);
        paint.drawLine(204, 236, 228, 236);
        paint.drawLine(203, 237, 227, 237);

        paint.drawLine(203, 238, 226, 238);
        paint.drawLine(203, 239, 223, 239);
        paint.drawLine(207, 240, 222, 240);
        // 
        paint.drawLine(281, 126, 285, 126);
        paint.drawLine(279, 127, 285, 127);
        paint.drawLine(274, 128, 285, 128);
        paint.drawLine(271, 129, 285, 129);

        paint.drawLine(271, 130, 285, 130);
        paint.drawLine(268, 131, 285, 131);
        paint.drawLine(266, 132, 285, 132);
        paint.drawLine(264, 133, 285, 133);

        paint.drawLine(262, 134, 285, 134);
        paint.drawLine(261, 135, 285, 135);
        paint.drawLine(260, 136, 285, 136);
        paint.drawLine(258, 137, 285, 137);

        paint.drawLine(256, 138, 285, 138);
        paint.drawLine(255, 139, 285, 139);
        paint.drawLine(254, 140, 285, 140);
        paint.drawLine(252, 141, 285, 141);

        //
        paint.drawLine(245, 142, 249, 142);
        paint.drawLine(245, 141, 247, 141);
        paint.drawLine(245, 140, 247, 140);
        paint.drawLine(245, 139, 246, 139);
        // 5

        paint.drawLine(251, 142, 285, 142);
        paint.drawLine(245, 143, 285, 143);
        paint.drawLine(245, 144, 285, 144);
        paint.drawLine(245, 145, 284, 145);

        paint.drawLine(245, 146, 284, 146);
        paint.drawLine(245, 147, 284, 147);
        paint.drawLine(245, 148, 284, 148);
        paint.drawLine(245, 149, 284, 149);

        paint.drawLine(245, 150, 284, 150);
        paint.drawLine(245, 151, 284, 151);
        paint.drawLine(245, 152, 284, 152);
        paint.drawLine(245, 153, 284, 153);
        paint.drawLine(245, 154, 284, 154);
        paint.drawLine(245, 155, 284, 155);
        paint.drawLine(245, 156, 283, 156);
        paint.drawLine(245, 157, 283, 157);

        paint.drawLine(245, 158, 282, 158);
        paint.drawLine(245, 159, 282, 159);
        paint.drawLine(245, 160, 282, 160);
        paint.drawLine(245, 161, 282, 161);

        paint.drawLine(245, 162, 281, 162);
        paint.drawLine(245, 163, 281, 163);
        paint.drawLine(245, 164, 281, 164);
        paint.drawLine(244, 165, 281, 165);

        paint.drawLine(244, 166, 281, 166);
        paint.drawLine(244, 167, 280, 167);
        paint.drawLine(244, 168, 279, 168);
        paint.drawLine(244, 169, 279, 169);

        paint.drawLine(243, 170, 279, 170);
        paint.drawLine(243, 171, 278, 171);
        paint.drawLine(243, 172, 278, 172);
        paint.drawLine(238, 173, 278, 173);

        paint.drawLine(238, 172, 242, 172);
        paint.drawLine(238, 171, 240, 171);
        paint.drawLine(238, 170, 240, 170);
        paint.drawLine(238, 169, 239, 169);
        // 
        paint.drawLine(207, 169 - 1, 209, 169 - 1);
        paint.drawLine(207, 170 - 1, 211, 170 - 1);
        paint.drawLine(207, 171 - 1, 212, 171 - 1);
        paint.drawLine(207, 172 - 1, 214, 172 - 1);

        paint.drawLine(208, 173 - 1, 215, 173 - 1);
        paint.drawLine(208, 174 - 1, 216, 174 - 1);
        paint.drawLine(208, 175 - 1, 217, 175 - 1);
        paint.drawLine(208, 176 - 1, 219, 176 - 1);

        paint.drawLine(208, 177 - 1, 220, 177 - 1);
        paint.drawLine(209, 178 - 1, 224, 178 - 1);
        paint.drawLine(209, 179 - 1, 224, 179 - 1);
        paint.drawLine(210, 180 - 1, 224, 180 - 1);

        paint.drawLine(231, 180 - 1, 224, 180 - 1);

        paint.drawLine(211, 180, 224, 180);
        paint.drawLine(211, 181, 224, 181);
        paint.drawLine(211, 182, 224, 182);
        paint.drawLine(211, 183, 224, 183);
        paint.drawLine(212, 184, 224, 184);
        paint.drawLine(212, 185, 224, 185);
        paint.drawLine(212, 186, 224, 186);
        // paint.drawLine(212, 187, 224, 187);
        paint.drawLine(213, 187, 224, 188);
        paint.drawLine(214, 188, 224, 187);
        paint.drawLine(215, 189, 224, 189);
        paint.drawLine(217, 190, 224, 190);
        paint.drawLine(219, 191, 224, 191);
        paint.drawLine(219, 192, 224, 192);
        // -----------------
        paint.drawLine(220, 193, 230, 193);
        paint.drawLine(222, 194, 230, 194);
        paint.drawLine(223, 195, 230, 195);
        paint.drawLine(224, 196, 230, 196);
        paint.drawLine(225, 197, 230, 197);
        paint.drawLine(227, 198, 230, 198);
        // -----------------
        paint.drawLine(228, 199, 245, 199);
        paint.drawLine(230, 200, 245, 200);
        paint.drawLine(231, 201, 245, 201);
        paint.drawLine(233, 202, 245, 202);
        paint.drawLine(234, 203, 245, 203);
        paint.drawLine(236, 204, 245, 204);
        paint.drawLine(238, 205, 245, 205);
        paint.drawLine(240, 206, 245, 206);
        paint.drawLine(240, 207, 245, 207);
        paint.drawLine(240, 208, 245, 208);

        // 
        paint.drawLine(237, 171 + 1, 238, 171 + 1);
        paint.drawLine(237, 172 + 1, 238, 172 + 1);
        paint.drawLine(237, 173 + 1, 238, 173 + 1);
        paint.drawLine(236, 174 + 1, 238, 174 + 1);
        paint.drawLine(235, 175 + 1, 238, 175 + 1);
        paint.drawLine(235, 176 + 1, 238, 176 + 1);
        paint.drawLine(234, 177 + 1, 238, 177 + 1);
        paint.drawLine(232, 178 + 1, 238, 178 + 1);
        // 
        paint.drawLine(241, 214, 245, 214);
        paint.drawLine(241, 215, 245, 215);
        paint.drawLine(241, 216, 245, 216);
        paint.drawLine(241, 217, 245, 217);
        paint.drawLine(242, 218, 245, 218);
        paint.drawLine(242, 219, 245, 219);
        paint.drawLine(242, 220, 245, 220);
        paint.drawLine(243, 221, 245, 221);
        paint.drawLine(243, 222, 245, 222);
        paint.drawLine(243, 223, 245, 223);
        paint.drawLine(243, 224, 245, 224);

        paint.drawLine(244, 225, 245, 225);
        paint.drawLine(244, 226, 245, 226);
        paint.drawLine(244, 227, 245, 227);
        paint.drawLine(244, 228, 245, 228);

        paint.drawLine(244, 229, 245, 229);
        paint.drawLine(244, 230, 245, 230);
        paint.drawLine(244, 231, 245, 231);
        paint.drawLine(244, 232, 245, 232);

        paint.drawLine(244, 233, 245, 233);
        paint.drawLine(244, 234, 245, 234);
        paint.drawLine(244, 235, 245, 235);
        paint.drawLine(244, 236, 245, 236);

        paint.drawLine(244, 237, 245, 237);
        paint.drawLine(244, 238, 245, 238);
        paint.drawLine(244, 239, 245, 239);
        paint.drawLine(244, 240, 245, 240); //
        // 
        paint.drawLine(248, 228, 250, 228);
        paint.drawLine(248, 229, 250, 229);
        paint.drawLine(248, 230, 250, 230);

        paint.drawLine(248, 231, 251, 231);
        paint.drawLine(248, 232, 251, 232);
        paint.drawLine(248, 233, 251, 233);

        paint.drawLine(248, 234, 252, 234);
        paint.drawLine(248, 235, 252, 235);
        paint.drawLine(248, 236, 252, 236);
        paint.drawLine(248, 237, 252, 237);
        paint.drawLine(248, 238, 252, 238);
        paint.drawLine(248, 239, 252, 239);
        paint.drawLine(248, 240, 252, 240);

        // 
        paint.drawLine(244, 241, 252, 241);
        paint.drawLine(244, 242, 250, 242);
        paint.drawLine(243, 243, 249, 243);

        paint.drawLine(242, 244, 246, 244);
        paint.drawLine(242, 245, 245, 245);
        paint.drawLine(242, 246, 245, 246);
        paint.drawLine(242, 247, 245, 247);
        paint.drawLine(242, 248, 245, 248);
        paint.drawLine(242, 249, 245, 249);
        paint.drawLine(242, 250, 245, 250);

        paint.drawLine(250, 248, 260, 248);
        paint.drawLine(248, 249, 261, 249);
        paint.drawLine(247, 250, 263, 250);

        paint.drawLine(233, 248, 237, 248);
        paint.drawLine(232, 249, 237, 249);
        paint.drawLine(230, 250, 238, 250);

        paint.drawLine(229, 251, 272, 251);
        paint.drawLine(228, 252, 272, 252);
        paint.drawLine(227, 253, 272, 253);

        paint.drawLine(215, 251 - 1, 218, 251 - 1);
        paint.drawLine(214, 252 - 1, 219, 252 - 1);
        paint.drawLine(213, 253 - 1, 220, 253 - 1);
        paint.drawLine(212, 254 - 1, 220, 254 - 1);
        paint.drawLine(211, 255 - 1, 220, 255 - 1);
        paint.drawLine(213, 256 - 1, 220, 256 - 1);
        paint.drawLine(214, 257 - 1, 220, 257 - 1);
        paint.drawLine(215, 258 - 1, 220, 258 - 1);

        paint.drawLine(225, 258, 229, 258);
        paint.drawLine(228, 259, 229, 259);

        paint.drawLine(230, 261, 236, 261);
        paint.drawLine(231, 262, 236, 262);
        paint.drawLine(233, 263, 236, 263);
        paint.drawLine(233, 264, 236, 264);
        paint.drawLine(234, 265, 236, 265);
        paint.drawLine(235, 266, 236, 266);
        paint.drawLine(235, 267, 236, 267);

        paint.drawLine(236, 268, 278, 268);
        paint.drawLine(236, 269, 256, 269);
        paint.drawLine(237, 270, 247, 270);
        paint.drawLine(237, 271, 246, 271);
        paint.drawLine(238, 272, 245, 272);
        paint.drawLine(239, 273, 244, 273);

        paint.drawLine(278, 266, 280, 266);
        paint.drawLine(278, 265, 280, 265);
        paint.drawLine(278, 264, 280, 264);
        paint.drawLine(278, 263, 281, 263);
        paint.drawLine(278, 262, 281, 262);
        paint.drawLine(278, 261, 282, 261);
        paint.drawLine(278, 260, 283, 260);
        paint.drawLine(278, 259, 283, 259);
        paint.drawLine(278, 258, 284, 258);
        paint.drawLine(278, 257, 284, 257);
        paint.drawLine(278, 256, 285, 256);
        paint.drawLine(278, 255, 285, 255);
        paint.drawLine(278, 254, 286, 254);
        paint.drawLine(278, 253, 287, 253);
        paint.drawLine(278, 252, 287, 252);
        paint.drawLine(278, 251, 288, 251);
        paint.drawLine(278, 250, 289, 250);
        //
        paint.drawLine(278, 249, 290, 249);
        paint.drawLine(270, 248, 291, 248);
        paint.drawLine(267, 247, 292, 247);
        paint.drawLine(266, 246, 293, 246);
        paint.drawLine(265, 245, 295, 245);
        paint.drawLine(264, 244, 305, 244);

        paint.drawLine(258, 243, 309, 243);
        // 
        paint.drawLine(258, 242, 277, 242);
        paint.drawLine(259, 241, 271, 241);
        paint.drawLine(259, 240, 269, 240);
        paint.drawLine(260, 239, 266, 239);
        paint.drawLine(260, 238, 265, 238);
        paint.drawLine(260, 237, 263, 237);
        paint.drawLine(260, 236, 262, 236);
        paint.drawLine(260, 235, 261, 235);

        // 
        paint.drawLine(295, 242, 309, 242);
        paint.drawLine(296, 241, 311, 241);
        paint.drawLine(298, 240, 312, 240);
        paint.drawLine(304, 239, 313, 239);

        paint.drawLine(305, 238, 314, 238);
        paint.drawLine(306, 237, 315, 237);
        paint.drawLine(307, 236, 316, 236);
        paint.drawLine(308, 235, 317, 235);

        paint.drawLine(309, 234, 318, 234);
        paint.drawLine(310, 233, 319, 233);
        paint.drawLine(310, 232, 320, 232);
        paint.drawLine(311, 231, 320, 231);

        paint.drawLine(311, 230, 320, 230);
        paint.drawLine(312, 229, 321, 229);
        paint.drawLine(312, 228, 321, 228);
        paint.drawLine(313, 227, 321, 227);

        paint.drawLine(314, 226, 321, 226);
        paint.drawLine(315, 225, 322, 225);
        paint.drawLine(315, 224, 323, 224);
        paint.drawLine(314, 223, 323, 223);
        paint.drawLine(314, 222, 323, 222);
        paint.setColor(Color.black);
        //
        paint.fillRect(300, 221, 318 - 300, 1);
        paint.fillRect(301, 220, 318 - 301, 1);
        paint.fillRect(303, 219, 318 - 303, 1);
        paint.fillRect(306, 218, 318 - 306, 1);
        paint.fillRect(309, 217, 318 - 309, 1);
        paint.fillRect(312, 216, 326 - 312, 1);

        paint.fillRect(316, 215, 326 - 316, 1);

        paint.fillRect(317, 214, 326 - 317, 1);
        paint.fillRect(319, 213, 326 - 319, 1);
        paint.fillRect(322, 212, 326 - 322, 1);
        paint.fillRect(324, 211, 326 - 324, 1);
        paint.fillRect(325, 210, 326 - 325, 1);
        paint.fillRect(327, 209, 330 - 327, 1);
        paint.fillRect(327, 208, 330 - 327, 1);
        paint.fillRect(298, 222, 11, 1);

        paint.fillRect(290, 216, 6, 1);
        paint.fillRect(290, 215, 7, 1);
        paint.fillRect(290, 214, 9, 1);

        paint.fillRect(290, 212, 12, 1);
        paint.fillRect(290, 211, 14, 1);

        paint.fillRect(290, 209, 19, 1);
        paint.fillRect(290, 208, 21, 1);
        paint.fillRect(290, 207, 24, 1);
        paint.fillRect(290, 206, 26, 1);

        paint.fillRect(301, 204, 19, 1);
        paint.fillRect(301, 203, 21, 1);
        paint.fillRect(301, 202, 22, 1);
        paint.fillRect(301, 201, 24, 1);
        paint.fillRect(301, 200, 26, 1);
        paint.fillRect(301, 199, 26, 1);

        paint.fillRect(290, 218, 4, 1);
        paint.fillRect(290, 219, 4, 1);
        paint.fillRect(290, 220, 3, 1);
        paint.fillRect(290, 221, 3, 1);
        paint.fillRect(290, 222, 3, 1);

        paint.fillRect(290, 223, 16, 1);
        paint.fillRect(290, 224, 13, 1);
        paint.fillRect(290, 225, 11, 1);
        paint.fillRect(290, 226, 8, 1);
        paint.fillRect(290, 227, 6, 1);
        paint.fillRect(290, 228, 3, 1);

        paint.fillRect(285, 229, 5, 1);
        paint.fillRect(285, 230, 4, 1);

        // paint.fillRect(266, 214, 3, 1);
        paint.fillRect(266, 215, 3, 1);
        paint.fillRect(265, 216, 4, 1);

        paint.fillRect(265, 217, 4, 1);
        paint.fillRect(264, 218, 5, 1);
        paint.fillRect(264, 219, 5, 1);
        paint.fillRect(264, 220, 5, 1);
        paint.fillRect(264, 221, 5, 1);
        paint.fillRect(264, 222, 5, 1);
        paint.fillRect(264, 223, 5, 1);
        paint.fillRect(264, 224, 5, 1);
        paint.fillRect(264, 225, 5, 1);
        paint.fillRect(264, 226, 5, 1);
        paint.fillRect(264, 227, 5, 1);
        paint.fillRect(264, 228, 5, 1);

        paint.fillRect(265, 229, 4, 1);
        paint.fillRect(265, 230, 4, 1);

        paint.fillRect(265, 231, 21, 1);
        paint.fillRect(267, 232, 19, 1);
        paint.fillRect(269, 233, 14, 1);

        paint.fillRect(265, 214, 35, 1);
        paint.fillRect(267, 213, 35, 1);
        paint.fillRect(269, 212, 35, 1);
        paint.fillRect(271, 211, 35, 1);

        paint.fillRect(272, 210, 35, 1);
        paint.fillRect(273, 209, 35, 1);
        paint.fillRect(274, 208, 35, 1);
        paint.fillRect(275, 207, 35, 1);

        paint.fillRect(276, 206, 35, 1);
        paint.fillRect(278, 205, 35, 1);
        paint.fillRect(279, 204, 35, 1);
        paint.fillRect(280, 203, 35, 1);

        paint.fillRect(281, 202, 35, 1);
        paint.fillRect(330, 198, 11, 1);
        paint.fillRect(330, 197, 11, 1);
        paint.fillRect(330, 196, 11, 1);

        paint.fillRect(330, 195, 2, 1);
        paint.fillRect(330, 194, 1, 1);
        paint.fillRect(330, 193, 1, 1);
        paint.fillRect(330, 192, 2, 1);
        paint.fillRect(330, 191, 2, 1);
        paint.fillRect(330, 190, 3, 1);
        paint.fillRect(330, 189, 3, 1);
        paint.fillRect(330, 188, 4, 1);

        paint.fillRect(330, 187, 4, 1);
        paint.fillRect(330, 186, 5, 1);
        paint.fillRect(330, 185, 5, 1);
        paint.fillRect(330, 184, 5, 1);
        paint.fillRect(330, 183, 5, 1);

        paint.fillRect(330, 182, 6, 1);
        paint.fillRect(330, 181, 6, 1);
        paint.fillRect(330, 180, 7, 1);
        paint.fillRect(330, 179, 7, 1);
        paint.fillRect(330, 178, 8, 1);
        paint.fillRect(330, 177, 8, 1);
        paint.fillRect(330, 176, 9, 1);
        paint.fillRect(330, 175, 9, 1);

        paint.fillRect(330, 174, 10, 1);
        paint.fillRect(330, 173, 10, 1);
        paint.fillRect(330, 172, 10, 1);
        paint.fillRect(330, 171, 10, 1);
        paint.fillRect(330, 170, 10, 1);
        paint.fillRect(330, 169, 10, 1);

        paint.fillRect(330, 168, 11, 1);
        paint.fillRect(330, 167, 11, 1);
        paint.fillRect(330, 166, 11, 1);
        paint.fillRect(330, 165, 11, 1);
        paint.fillRect(330, 164, 11, 1);
        paint.fillRect(330, 163, 11, 1);

        paint.fillRect(330, 162, 11, 1);
        paint.fillRect(330, 161, 11, 1);
        paint.fillRect(330, 160, 11, 1);
        paint.fillRect(330, 159, 11, 1);
        paint.fillRect(330, 158, 11, 1);
        paint.fillRect(330, 157, 11, 1);
        paint.fillRect(330, 156, 11, 1);
        paint.fillRect(330, 155, 11, 1);
        paint.fillRect(330, 154, 11, 1);
        paint.fillRect(330, 153, 11, 1);

        paint.fillRect(330, 152, 12, 1);
        paint.fillRect(330, 151, 12, 1);
        paint.fillRect(330, 150, 12, 1);

        paint.fillRect(330, 149, 13, 1);

        paint.fillRect(330, 148, 19, 1);
        paint.fillRect(330, 147, 19, 1);
        paint.fillRect(330, 146, 19, 1);
        paint.fillRect(330, 145, 19, 1);
        paint.fillRect(330, 144, 19, 1);
        paint.fillRect(330, 143, 19, 1);
        paint.fillRect(330, 142, 19, 1);
        paint.fillRect(330, 141, 19, 1);
        paint.fillRect(330, 140, 19, 1);
        paint.fillRect(330, 139, 19, 1);

        paint.fillRect(336, 195, 11, 1);
        paint.fillRect(337, 194, 11, 1);
        paint.fillRect(338, 193, 11, 1);
        paint.fillRect(339, 192, 11, 1);
        paint.fillRect(340, 191, 11, 1);
        paint.fillRect(341, 190, 11, 1);
        paint.fillRect(341, 189, 11, 1);
        paint.fillRect(341, 188, 11, 1);
        paint.fillRect(341, 187, 11, 1);
        paint.fillRect(342, 186, 11, 1);
        paint.fillRect(343, 185, 11, 1);
        paint.fillRect(344, 184, 11, 1);
        paint.fillRect(344, 183, 11, 1);
        paint.fillRect(345, 182, 11, 1);
        paint.fillRect(345, 181, 11, 1);
        paint.fillRect(345, 180, 11, 1);
        paint.fillRect(346, 179, 11, 1);

        paint.fillRect(346, 178, 11, 1);
        paint.fillRect(346, 177, 11, 1);
        paint.fillRect(347, 176, 11, 1);
        paint.fillRect(347, 175, 11, 1);
        paint.fillRect(347, 174, 11, 1);
        paint.fillRect(347, 173, 11, 1);

        paint.fillRect(348, 172, 11, 1);
        paint.fillRect(348, 171, 11, 1);
        paint.fillRect(348, 170, 11, 1);
        paint.fillRect(348, 169, 11, 1);
        paint.fillRect(348, 168, 11, 1);
        paint.fillRect(348, 167, 11, 1);

        paint.fillRect(286, 200, 11, 1);
        paint.fillRect(287, 199, 11, 1);
        paint.fillRect(288, 198, 11, 1);
        paint.fillRect(289, 197, 11, 1);
        paint.fillRect(290, 196, 11, 1);
        paint.fillRect(291, 195, 11, 1);
        paint.fillRect(292, 194, 11, 1);
        paint.fillRect(293, 193, 11, 1);
        paint.fillRect(294, 192, 11, 1);

        paint.fillRect(296, 191, 11, 1);
        paint.fillRect(297, 190, 11, 1);
        paint.fillRect(298, 189, 11, 1);
        paint.fillRect(298, 188, 11, 1);
        paint.fillRect(300, 187, 11, 1);
        paint.fillRect(301, 186, 11, 1);
        paint.fillRect(302, 185, 11, 1);
        paint.fillRect(303, 184, 11, 1);
        paint.fillRect(305, 183, 11, 1);

        paint.fillRect(305, 182, 11, 1);
        paint.fillRect(306, 181, 11, 1);
        paint.fillRect(306, 180, 11, 1);
        paint.fillRect(306, 179, 11, 1);
        paint.fillRect(306, 178, 11, 1);
        paint.fillRect(306, 177, 11, 1);
        paint.fillRect(306, 176, 11, 1);

        paint.fillRect(307, 175, 11, 1);
        paint.fillRect(307, 174, 11, 1);
        paint.fillRect(307, 173, 11, 1);
        paint.fillRect(307, 172, 11, 1);
        paint.fillRect(308, 171, 11, 1);
        paint.fillRect(308, 170, 11, 1);
        paint.fillRect(308, 169, 11, 1);
        paint.fillRect(308, 168, 11, 1);
        paint.fillRect(308, 167, 11, 1);

        paint.fillRect(309, 166, 11, 1);
        paint.fillRect(309, 165, 11, 1);
        paint.fillRect(309, 164, 11, 1);

        paint.fillRect(310, 163, 11, 1);
        paint.fillRect(311, 162, 11, 1);
        paint.fillRect(312, 161, 11, 1);

        paint.fillRect(312, 160, 11, 1);
        paint.fillRect(312, 159, 11, 1);
        paint.fillRect(313, 158, 11, 1);

        paint.fillRect(313, 157, 11, 1);

        paint.fillRect(314, 156, 11, 1);

        paint.fillRect(314, 155, 11, 1);

        paint.fillRect(314, 154, 11, 1);

        paint.fillRect(315, 153, 11, 1);
        paint.fillRect(315, 152, 11, 1);
        paint.fillRect(315, 151, 11, 1);
        paint.fillRect(315, 150, 11, 1);
        paint.fillRect(315, 149, 11, 1);
        paint.fillRect(315, 148, 11, 1);
        paint.fillRect(316, 147, 11, 1);
        paint.fillRect(316, 146, 11, 1);
        paint.fillRect(316, 145, 11, 1);
        paint.fillRect(316, 144, 11, 1);

        paint.fillRect(316, 143, 11, 1);
        paint.fillRect(317, 142, 11, 1);
        paint.fillRect(317, 141, 19, 1);
        paint.fillRect(317, 140, 19, 1);

        paint.fillRect(317, 139, 19, 1);
        paint.fillRect(318, 138, 19, 1);
        paint.fillRect(318, 137, 19, 1);
        paint.fillRect(318, 136, 19, 1);

        paint.fillRect(318, 135, 19, 1);
        paint.fillRect(319, 134, 19, 1);
        paint.fillRect(319, 133, 19, 1);

        paint.fillRect(321, 132, 19, 1);
        paint.fillRect(321, 131, 19, 1);
        paint.fillRect(321, 130, 19, 1);
        paint.fillRect(323, 129, 19, 1);
        paint.fillRect(323, 128, 19, 1);
        paint.fillRect(323, 127, 19, 1);
        paint.fillRect(325, 126, 19, 1);

        paint.fillRect(325, 125, 11, 1);
        paint.fillRect(327, 124, 11, 1);
        paint.fillRect(327, 123, 11, 1);
        paint.fillRect(329, 122, 11, 1);
        paint.fillRect(329, 121, 11, 1);
        paint.fillRect(329, 120, 11, 1);
        paint.fillRect(331, 119, 11, 1);
        paint.fillRect(331, 118, 11, 1);
        paint.fillRect(331, 117, 11, 1);

        paint.fillRect(331, 116, 11, 1);
        paint.fillRect(331, 115, 11, 1);
        paint.fillRect(333, 114, 11, 1);
        paint.fillRect(333, 113, 11, 1);
        paint.fillRect(335, 112, 11, 1);
        paint.fillRect(335, 111, 11, 1);
        paint.fillRect(335, 110, 11, 1);
        paint.fillRect(335, 109, 11, 1);
        paint.fillRect(335, 108, 11, 1);
        //
        paint.fillRect(295, 118, 1, 1);
        paint.fillRect(295, 119, 2, 1);
        paint.fillRect(295, 120, 2, 1);
        paint.fillRect(295, 121, 3, 1);
        paint.fillRect(295, 122, 3, 1);

        paint.fillRect(313, 112, 4, 1);
        paint.fillRect(312, 113, 5, 1);
        paint.fillRect(311, 114, 6, 1);
        paint.fillRect(310, 115, 7, 1);
        paint.fillRect(309, 116, 8, 1);
        paint.fillRect(308, 117, 9, 1);
        paint.fillRect(307, 118, 10, 1);
        paint.fillRect(306, 119, 11, 1);
        paint.fillRect(305, 120, 12, 1);
        paint.fillRect(304, 121, 13, 1);
        paint.fillRect(303, 122, 14, 1);

        paint.fillRect(295, 123, 22, 1);
        paint.fillRect(295, 124, 22, 1);
        paint.fillRect(295, 125, 22, 1);
        paint.fillRect(295, 126, 22, 1);
        paint.fillRect(295, 127, 21, 1);
        paint.fillRect(295, 128, 21, 1);
        paint.fillRect(295, 129, 21, 1);

        paint.fillRect(294, 130, 21, 1);
        paint.fillRect(294, 131, 21, 1);
        paint.fillRect(294, 132, 21, 1);
        paint.fillRect(294, 133, 20, 1);
        paint.fillRect(294, 134, 20, 1);
        paint.fillRect(294, 135, 20, 1);
        paint.fillRect(294, 136, 20, 1);
        paint.fillRect(294, 137, 20, 1);

        paint.fillRect(294, 138, 20, 1);
        paint.fillRect(294, 139, 20, 1);
        paint.fillRect(293, 140, 20, 1);
        paint.fillRect(293, 141, 20, 1);
        paint.fillRect(293, 142, 20, 1);
        paint.fillRect(293, 143, 20, 1);
        paint.fillRect(293, 144, 20, 1);
        paint.fillRect(293, 145, 20, 1);
        paint.fillRect(293, 146, 20, 1);

        paint.fillRect(292, 147, 20, 1);
        paint.fillRect(292, 148, 20, 1);
        paint.fillRect(292, 149, 20, 1);
        paint.fillRect(292, 147, 20, 1);
        paint.fillRect(292, 148, 20, 1);
        paint.fillRect(292, 149, 20, 1);
        paint.fillRect(292, 147, 20, 1);
        paint.fillRect(292, 148, 20, 1);
        paint.fillRect(292, 149, 20, 1);

        paint.fillRect(292, 147, 20, 1);
        paint.fillRect(291, 148, 20, 1);
        paint.fillRect(291, 149, 20, 1);
        paint.fillRect(291, 150, 20, 1);
        paint.fillRect(291, 151, 19, 1);
        paint.fillRect(291, 152, 19, 1);
        paint.fillRect(291, 153, 19, 1);
        paint.fillRect(291, 154, 19, 1);

        paint.fillRect(289, 155, 19, 1);
        paint.fillRect(289, 156, 19, 1);
        paint.fillRect(289, 157, 19, 1);
        paint.fillRect(289, 158, 19, 1);
        paint.fillRect(289, 159, 19, 1);
        paint.fillRect(289, 160, 19, 1);

        paint.fillRect(288, 161, 19, 1);
        paint.fillRect(288, 162, 19, 1);
        paint.fillRect(288, 163, 19, 1);
        paint.fillRect(288, 164, 18, 1);
        paint.fillRect(288, 165, 18, 1);
        paint.fillRect(288, 166, 17, 1);
        paint.fillRect(288, 167, 16, 1);
        paint.fillRect(288, 168, 15, 1);

        paint.fillRect(287, 169, 15, 1);
        paint.fillRect(287, 170, 15, 1);
        paint.fillRect(287, 171, 15, 1);
        paint.fillRect(287, 172, 15, 1);
        paint.fillRect(287, 173, 15, 1);
        paint.fillRect(287, 174, 15, 1);

        paint.fillRect(286, 175, 15, 1);
        paint.fillRect(285, 176, 15, 1);
        paint.fillRect(284, 177, 15, 1);
        paint.fillRect(284, 178, 15, 1);

        paint.fillRect(284, 179, 14, 1);
        paint.fillRect(284, 180, 13, 1);
        paint.fillRect(284, 181, 12, 1);
        paint.fillRect(283, 182, 11, 1);

        paint.fillRect(281, 183, 11, 1);
        paint.fillRect(280, 184, 11, 1);
        paint.fillRect(279, 185, 11, 1);
        paint.fillRect(278, 186, 11, 1);

        paint.fillRect(277, 187, 11, 1);
        paint.fillRect(276, 188, 11, 1);
        paint.fillRect(275, 189, 11, 1);
        paint.fillRect(274, 190, 11, 1);

        paint.fillRect(273, 191, 11, 1);
        paint.fillRect(272, 192, 11, 1);
        paint.fillRect(271, 193, 11, 1);
        paint.fillRect(270, 194, 11, 1);

        paint.fillRect(269, 195, 11, 1);
        paint.fillRect(268, 196, 11, 1);
        paint.fillRect(267, 197, 11, 1);
        paint.fillRect(266, 198, 11, 1);

        paint.fillRect(265, 199, 11, 1);
        paint.fillRect(264, 200, 11, 1);
        paint.fillRect(263, 201, 11, 1);
        paint.fillRect(262, 202, 11, 1);
        paint.fillRect(261, 203, 11, 1);
        paint.fillRect(260, 204, 11, 1);
        //
        paint.fillRect(259, 205, 11, 1);
        paint.fillRect(258, 206, 9, 1);
        paint.fillRect(258, 207, 9, 1);
        paint.fillRect(258, 208, 7, 1);
        paint.fillRect(258, 209, 7, 1);
        paint.fillRect(258, 210, 5, 1);
        paint.fillRect(258, 211, 5, 1);
        paint.fillRect(258, 212, 2, 1);
        paint.fillRect(258, 213, 1, 1);
        //
        paint.setColor(Color.black);
        // 
        paint.fillRect(247 - 2, 177 - 3, 279 - 2 - (247 - 2), 1);

        paint.fillRect(247 - 2, 178 - 3, 279 - 2 - (247 - 2), 1);
        paint.fillRect(247 - 2, 179 - 3, 278 - 2 - (247 - 2), 1);
        paint.fillRect(247 - 2, 180 - 3, 277 - 2 - (247 - 2), 1);
        paint.fillRect(247 - 2, 181 - 3, 277 - 2 - (247 - 2), 1);
        paint.fillRect(247 - 2, 182 - 3, 276 - 2 - (247 - 2), 1);

        paint.fillRect(247 - 2, 183 - 3, 275 - 2 - (247 - 2), 1);
        paint.fillRect(247 - 2, 184 - 3, 275 - 2 - (247 - 2), 1);

        paint.fillRect(247 - 2, 185 - 3, 274 - 2 - (247 - 2), 1);
        paint.fillRect(247 - 2, 186 - 3, 273 - 2 - (247 - 2), 1);
        paint.fillRect(247 - 2, 187 - 3, 272 - 2 - (247 - 2), 1);
        paint.fillRect(247 - 2, 188 - 3, 271 - 2 - (247 - 2), 1);
        paint.fillRect(247 - 2, 189 - 3, 270 - 2 - (247 - 2), 1);
        paint.fillRect(247 - 2, 190 - 3, 269 - 2 - (247 - 2), 1);

        paint.fillRect(247 - 2, 191 - 3, 268 - 2 - (247 - 2), 1);
        paint.fillRect(247 - 2, 192 - 3, 268 - 2 - (247 - 2), 1);

        paint.fillRect(247 - 2, 193 - 3, 266 - 2 - (247 - 2), 1);
        paint.fillRect(247 - 2, 194 - 3, 265 - 2 - (247 - 2), 1);
        paint.fillRect(247 - 2, 195 - 3, 264 - 2 - (247 - 2), 1);
        paint.fillRect(247 - 2, 196 - 3, 263 - 2 - (247 - 2), 1);

        paint.fillRect(247 - 2, 197 - 3, 262 - 2 - (247 - 2), 1);
        paint.fillRect(247 - 2, 198 - 3, 261 - 2 - (247 - 2), 1);
        paint.fillRect(247 - 2, 199 - 3, 260 - 2 - (247 - 2), 1);
        paint.fillRect(247 - 2, 200 - 3, 259 - 2 - (247 - 2), 1);

        paint.fillRect(247 - 2, 201 - 3, 258 - 2 - (247 - 2), 1);
        paint.fillRect(247 - 2, 202 - 3, 257 - 2 - (247 - 2), 1);

        paint.fillRect(247 - 2, 203 - 3, 256 - 2 - (247 - 2), 1);

        paint.fillRect(247 - 2, 204 - 3, 254 - 2 - (247 - 2), 1);
        paint.fillRect(247 - 2, 205 - 3, 253 - 2 - (247 - 2), 1);
        paint.fillRect(247 - 2, 206 - 3, 252 - 2 - (247 - 2), 1);
        paint.fillRect(247 - 2, 207 - 3, 251 - 2 - (247 - 2), 1);

        paint.fillRect(247 - 2, 208 - 3, 250 - 2 - (247 - 2), 1);
        paint.fillRect(247 - 2, 209 - 3, 250 - 2 - (247 - 2), 1);
        paint.fillRect(247 - 2, 210 - 3, 249 - 2 - (247 - 2), 1);
        paint.fillRect(247 - 2, 211 - 3, 249 - 2 - (247 - 2), 1);

        paint.fillRect(247 - 2, 212 - 3, 249 - 2 - (247 - 2), 1);
        paint.fillRect(247 - 2, 213 - 3, 249 - 2 - (247 - 2), 1);
        paint.fillRect(247 - 2, 214 - 3, 249 - 2 - (247 - 2), 1);
        paint.fillRect(247 - 2, 215 - 3, 249 - 2 - (247 - 2), 1);
        paint.fillRect(247 - 2, 216 - 3, 249 - 2 - (247 - 2), 1);

        paint.fillRect(247 - 2, 217 - 3, 250 - 2 - (247 - 2), 1);

        paint.setColor(Color.DARK_GRAY);
        // -------------------------------
        paint.fillRect(0, 380, 600, 400);

        String name = new String("Black Panther");
        String name1 = new String("chadwick boseman");
        // set the font style to Times New Roman with a plain text and a font size of 30
        paint.setFont(new Font("TimesRoman", Font.PLAIN, 50));

        // font color is set to Red
        paint.setColor(Color.pink);

        // and then draw the string with the specific coodrinates
        paint.drawString(name, 40, 450);

        paint.drawString(name1, 190, 520);
        //
    }
}

public class Assignment1 extends JComponent {
    public static void main(String[] args) {

        Assignment1 panel = new Assignment1(); // Create panel from JPanel

        JFrame frame = new JFrame(); // Create frame
        frame.add(panel);
        frame.setTitle("62050185 Nanthawat Mingjindakul");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new MyCanvas());
        frame.setVisible(true);
    }
}