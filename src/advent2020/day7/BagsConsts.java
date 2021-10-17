package advent2020.day7;

public class BagsConsts {
    public final static String RULES =
            "light red bags contain 1 bright white bag, 2 muted yellow bags.\n" +
                    "dark orange bags contain 3 bright white bags, 4 muted yellow bags.\n" +
                    "bright white bags contain 1 shiny gold bag.\n" +
                    "muted yellow bags contain 2 shiny gold bags, 9 faded blue bags.\n" +
                    "shiny gold bags contain 1 dark olive bag, 2 vibrant plum bags.\n" +
                    "dark olive bags contain 3 faded blue bags, 4 dotted black bags.\n" +
                    "vibrant plum bags contain 5 faded blue bags, 6 dotted black bags.\n" +
                    "faded blue bags contain no other bags.\n" +
                    "dotted black bags contain no other bags";

    public static final String FULL_RULES = "plaid magenta bags contain 2 clear lavender bags, 3 clear teal bags, 4 vibrant gold bags.\n" +
            "light teal bags contain 4 drab magenta bags, 2 dull crimson bags, 3 posh brown bags.\n" +
            "wavy gray bags contain 3 dark aqua bags.\n" +
            "faded magenta bags contain 3 dark crimson bags, 3 dark violet bags.\n" +
            "shiny aqua bags contain 1 plaid turquoise bag.\n" +
            "muted maroon bags contain 2 dim cyan bags.\n" +
            "pale yellow bags contain 5 dotted black bags, 2 drab silver bags, 3 shiny gold bags.\n" +
            "dark white bags contain 5 posh salmon bags, 5 wavy brown bags, 4 dark fuchsia bags.\n" +
            "plaid tomato bags contain 1 posh brown bag, 3 muted white bags, 4 vibrant fuchsia bags, 2 drab magenta bags.\n" +
            "wavy green bags contain 5 pale brown bags, 3 plaid turquoise bags, 2 mirrored maroon bags.\n" +
            "posh tomato bags contain 5 mirrored white bags, 1 shiny lavender bag.\n" +
            "vibrant silver bags contain 4 dotted lavender bags, 3 wavy green bags, 1 striped yellow bag, 4 muted plum bags.\n" +
            "mirrored cyan bags contain 1 faded plum bag, 5 dull purple bags.\n" +
            "bright yellow bags contain 1 clear yellow bag, 3 muted indigo bags.\n" +
            "shiny plum bags contain 3 shiny teal bags, 3 wavy gray bags.\n" +
            "striped gold bags contain 1 dull plum bag, 2 dark crimson bags, 4 bright lime bags, 2 vibrant teal bags.\n" +
            "faded black bags contain 3 faded bronze bags.\n" +
            "dim white bags contain 5 striped turquoise bags, 4 muted yellow bags, 4 shiny crimson bags.\n" +
            "light bronze bags contain 5 bright plum bags.\n" +
            "vibrant maroon bags contain 3 dim beige bags, 4 drab blue bags.\n" +
            "vibrant lime bags contain 2 pale cyan bags.\n" +
            "striped fuchsia bags contain 1 vibrant bronze bag, 3 shiny lavender bags.\n" +
            "mirrored indigo bags contain 4 dim gray bags.\n" +
            "posh bronze bags contain 5 muted coral bags, 2 pale orange bags.\n" +
            "drab coral bags contain no other bags.\n" +
            "mirrored violet bags contain 2 dotted purple bags, 2 posh green bags.\n" +
            "dotted lime bags contain 3 dull fuchsia bags, 4 plaid fuchsia bags, 4 pale gray bags, 3 drab fuchsia bags.\n" +
            "dull gray bags contain 4 bright brown bags, 5 dark blue bags, 4 dull cyan bags, 1 dark violet bag.\n" +
            "posh indigo bags contain 1 faded teal bag, 3 dark cyan bags.\n" +
            "shiny orange bags contain 3 mirrored green bags, 5 dim tomato bags.\n" +
            "faded lime bags contain 5 vibrant olive bags.\n" +
            "dim magenta bags contain 3 vibrant green bags, 1 vibrant olive bag.\n" +
            "light salmon bags contain 1 dim turquoise bag, 1 muted tomato bag, 4 bright black bags, 5 posh yellow bags.\n" +
            "bright bronze bags contain 4 pale black bags, 2 mirrored maroon bags.\n" +
            "striped yellow bags contain 5 mirrored red bags, 3 light tan bags, 4 vibrant teal bags.\n" +
            "dark teal bags contain 5 posh yellow bags, 4 dull plum bags, 3 muted plum bags, 5 mirrored beige bags.\n" +
            "plaid green bags contain 4 mirrored yellow bags, 4 dark aqua bags, 2 muted gray bags.\n" +
            "bright red bags contain 2 faded olive bags, 5 drab olive bags, 1 striped lime bag.\n" +
            "light plum bags contain 2 pale coral bags.\n" +
            "muted yellow bags contain no other bags.\n" +
            "wavy yellow bags contain 3 posh plum bags, 2 dotted chartreuse bags, 4 dotted magenta bags.\n" +
            "drab brown bags contain 2 clear blue bags.\n" +
            "posh purple bags contain 4 light coral bags, 1 dim aqua bag.\n" +
            "faded brown bags contain 2 faded salmon bags, 5 striped crimson bags.\n" +
            "dark blue bags contain 4 pale brown bags, 1 mirrored gray bag.\n" +
            "mirrored gold bags contain 2 wavy gold bags, 4 muted gray bags, 5 drab olive bags.\n" +
            "muted tomato bags contain 1 bright violet bag, 5 pale plum bags, 5 light plum bags.\n" +
            "wavy tomato bags contain 4 dim beige bags, 5 faded orange bags.\n" +
            "clear aqua bags contain 1 dull lime bag, 1 clear violet bag, 2 dim tan bags, 3 bright gray bags.\n" +
            "clear violet bags contain 4 posh brown bags, 2 striped fuchsia bags.\n" +
            "plaid yellow bags contain 1 pale fuchsia bag, 1 mirrored purple bag, 4 faded purple bags.\n" +
            "muted lime bags contain 3 dotted lavender bags, 1 faded turquoise bag, 1 plaid chartreuse bag.\n" +
            "bright orange bags contain 1 shiny aqua bag, 2 mirrored salmon bags, 3 posh red bags.\n" +
            "pale cyan bags contain 3 dim orange bags, 4 drab lavender bags, 2 bright coral bags, 5 light white bags.\n" +
            "dark magenta bags contain 5 dull salmon bags, 1 drab cyan bag, 1 dotted maroon bag, 1 dim tomato bag.\n" +
            "plaid chartreuse bags contain 5 dotted orange bags, 2 vibrant maroon bags, 1 dotted lavender bag.\n" +
            "dotted tomato bags contain 2 muted bronze bags, 1 dark magenta bag.\n" +
            "muted tan bags contain 2 plaid tan bags.\n" +
            "posh magenta bags contain 2 vibrant red bags, 4 muted gray bags, 2 vibrant maroon bags.\n" +
            "bright purple bags contain 4 bright gray bags, 2 plaid tomato bags.\n" +
            "drab chartreuse bags contain 1 light blue bag, 3 drab gray bags, 1 dim tan bag, 5 posh crimson bags.\n" +
            "shiny white bags contain 5 dull beige bags.\n" +
            "bright cyan bags contain 4 shiny tomato bags, 1 muted lavender bag.\n" +
            "faded blue bags contain 3 vibrant aqua bags, 3 muted orange bags.\n" +
            "light cyan bags contain 4 mirrored magenta bags, 1 dotted turquoise bag.\n" +
            "wavy salmon bags contain 3 clear tan bags, 1 dull bronze bag.\n" +
            "pale indigo bags contain 2 faded blue bags, 2 pale yellow bags, 5 dim tomato bags, 5 dark coral bags.\n" +
            "pale olive bags contain 5 muted olive bags, 4 dim olive bags, 5 clear violet bags.\n" +
            "shiny brown bags contain 1 dark green bag, 3 vibrant olive bags, 1 wavy indigo bag.\n" +
            "shiny coral bags contain 5 bright violet bags.\n" +
            "posh plum bags contain 3 pale coral bags, 1 dull green bag, 1 plaid cyan bag, 4 shiny orange bags.\n" +
            "shiny silver bags contain 3 dotted brown bags, 3 bright tomato bags, 2 posh tomato bags.\n" +
            "wavy gold bags contain 1 bright gray bag, 1 shiny fuchsia bag.\n" +
            "vibrant yellow bags contain 2 posh lavender bags, 1 pale purple bag, 5 muted plum bags, 3 faded chartreuse bags.\n" +
            "drab blue bags contain 4 drab silver bags, 4 bright plum bags.\n" +
            "vibrant turquoise bags contain 2 bright maroon bags.\n" +
            "pale violet bags contain 5 faded violet bags.\n" +
            "dark bronze bags contain 4 faded indigo bags, 5 muted yellow bags.\n" +
            "drab gray bags contain no other bags.\n" +
            "shiny violet bags contain 2 bright lime bags, 5 dull magenta bags.\n" +
            "striped tomato bags contain 1 wavy indigo bag, 5 shiny coral bags, 5 vibrant bronze bags.\n" +
            "dull yellow bags contain 3 muted teal bags, 1 dim green bag, 4 pale brown bags.\n" +
            "shiny lime bags contain 5 muted yellow bags, 1 drab gray bag, 2 faded yellow bags, 1 pale magenta bag.\n" +
            "vibrant tan bags contain 1 vibrant lime bag, 1 drab blue bag, 5 dark maroon bags.\n" +
            "wavy coral bags contain 1 clear gold bag, 2 drab tan bags, 1 plaid magenta bag, 2 pale lime bags.\n" +
            "bright beige bags contain 3 bright violet bags.\n" +
            "dim silver bags contain 4 bright plum bags.\n" +
            "plaid beige bags contain 4 dotted turquoise bags, 5 shiny salmon bags, 2 pale red bags.\n" +
            "light blue bags contain no other bags.\n" +
            "wavy brown bags contain 4 light yellow bags, 1 dark coral bag, 2 dark olive bags, 4 vibrant teal bags.\n" +
            "pale gray bags contain 5 faded cyan bags, 2 shiny lime bags, 3 striped blue bags, 5 drab purple bags.\n" +
            "vibrant white bags contain 3 drab gray bags, 4 faded blue bags, 2 clear white bags, 1 dull tan bag.\n" +
            "light lime bags contain 3 muted white bags, 2 dark fuchsia bags.\n" +
            "dark yellow bags contain 3 vibrant maroon bags.\n" +
            "vibrant indigo bags contain 4 dark olive bags, 5 light purple bags.\n" +
            "faded yellow bags contain 1 posh brown bag, 2 light blue bags, 4 mirrored teal bags, 1 dull crimson bag.\n" +
            "mirrored bronze bags contain 3 bright black bags, 4 faded blue bags, 3 striped salmon bags, 4 mirrored olive bags.\n" +
            "pale chartreuse bags contain 3 dim aqua bags, 4 mirrored lime bags.\n" +
            "plaid gray bags contain 1 vibrant aqua bag.\n" +
            "pale fuchsia bags contain 5 wavy yellow bags, 3 dotted brown bags, 3 muted black bags, 1 dotted turquoise bag.\n" +
            "vibrant olive bags contain 1 faded tan bag, 3 drab silver bags, 4 muted brown bags, 2 faded blue bags.\n" +
            "dotted olive bags contain 3 plaid gold bags, 5 mirrored salmon bags, 2 dim magenta bags.\n" +
            "muted purple bags contain 2 muted magenta bags.\n" +
            "dim teal bags contain 2 dotted maroon bags.\n" +
            "mirrored red bags contain 3 dim tan bags, 5 clear black bags, 3 faded violet bags, 1 mirrored olive bag.\n" +
            "dark lime bags contain 3 mirrored violet bags.\n" +
            "shiny beige bags contain 1 dim yellow bag, 2 mirrored coral bags, 2 bright salmon bags, 5 vibrant brown bags.\n" +
            "dim gold bags contain 1 shiny gold bag.\n" +
            "mirrored maroon bags contain 1 faded blue bag.\n" +
            "shiny olive bags contain 5 plaid olive bags, 3 muted silver bags.\n" +
            "wavy purple bags contain 3 dim cyan bags, 2 dotted white bags, 4 dark coral bags.\n" +
            "drab fuchsia bags contain 4 dull gold bags, 3 muted yellow bags, 4 muted orange bags, 4 faded fuchsia bags.\n" +
            "drab beige bags contain 2 plaid olive bags.\n" +
            "vibrant coral bags contain 3 mirrored cyan bags.\n" +
            "dull salmon bags contain 2 shiny gold bags.\n" +
            "light chartreuse bags contain 3 plaid cyan bags.\n" +
            "striped silver bags contain 3 shiny violet bags, 3 dark blue bags.\n" +
            "dark indigo bags contain 3 light beige bags, 3 wavy white bags, 2 light black bags, 4 striped silver bags.\n" +
            "dotted orange bags contain 2 dull bronze bags, 3 vibrant red bags, 5 dull gold bags, 3 shiny yellow bags.\n" +
            "dotted fuchsia bags contain 1 vibrant cyan bag, 4 dotted crimson bags.\n" +
            "shiny turquoise bags contain 1 dark aqua bag, 4 dark cyan bags.\n" +
            "posh beige bags contain 1 shiny purple bag.\n" +
            "shiny tan bags contain 2 bright violet bags, 5 faded orange bags, 2 mirrored cyan bags.\n" +
            "faded maroon bags contain 1 dark red bag, 1 mirrored red bag.\n" +
            "clear tomato bags contain 4 mirrored teal bags, 2 posh turquoise bags.\n" +
            "pale beige bags contain 2 pale salmon bags, 5 dark teal bags, 4 shiny chartreuse bags, 5 striped green bags.\n" +
            "dull red bags contain 1 pale plum bag.\n" +
            "striped salmon bags contain 4 drab cyan bags, 5 light yellow bags, 4 vibrant orange bags, 4 dark gold bags.\n" +
            "dull lavender bags contain 3 pale blue bags, 5 clear blue bags.\n" +
            "dim red bags contain 3 vibrant bronze bags, 3 dotted gray bags.\n" +
            "light orange bags contain 2 plaid teal bags, 2 dull brown bags, 3 dark brown bags.\n" +
            "dotted silver bags contain 1 vibrant yellow bag, 4 pale lime bags, 4 pale crimson bags.\n" +
            "mirrored gray bags contain 1 dark coral bag, 2 mirrored crimson bags, 3 light yellow bags, 5 dull crimson bags.\n" +
            "light black bags contain 1 drab tan bag, 3 drab lavender bags.\n" +
            "plaid purple bags contain 4 clear tan bags, 3 dim yellow bags.\n" +
            "mirrored tan bags contain 2 dark olive bags, 4 clear violet bags, 5 wavy salmon bags.\n" +
            "dark silver bags contain 3 shiny silver bags, 3 dark lime bags.\n" +
            "dark violet bags contain 3 faded violet bags, 1 dull plum bag, 1 drab silver bag, 1 pale purple bag.\n" +
            "drab magenta bags contain 1 dark aqua bag, 2 muted maroon bags, 5 drab green bags.\n" +
            "pale green bags contain 5 posh red bags, 1 light fuchsia bag, 2 dotted chartreuse bags.\n" +
            "mirrored beige bags contain 4 vibrant turquoise bags, 4 muted yellow bags, 5 faded cyan bags, 2 drab purple bags.\n" +
            "striped aqua bags contain 4 clear black bags, 3 striped indigo bags.\n" +
            "mirrored crimson bags contain 2 dull gold bags, 5 wavy blue bags, 2 bright plum bags, 4 shiny yellow bags.\n" +
            "striped crimson bags contain 3 clear blue bags.\n" +
            "muted lavender bags contain 1 drab coral bag, 2 dull gold bags, 2 posh crimson bags, 1 mirrored green bag.\n" +
            "light tomato bags contain 3 dull black bags, 5 posh white bags.\n" +
            "pale tan bags contain 1 clear yellow bag, 2 vibrant aqua bags, 1 wavy red bag, 2 drab chartreuse bags.\n" +
            "dotted plum bags contain 4 shiny tomato bags, 1 mirrored olive bag, 2 posh turquoise bags, 1 faded bronze bag.\n" +
            "vibrant bronze bags contain 1 vibrant aqua bag.\n" +
            "clear tan bags contain 5 vibrant aqua bags, 1 drab coral bag, 4 muted lavender bags, 1 muted orange bag.\n" +
            "dark beige bags contain 5 dull green bags, 5 clear violet bags, 1 pale coral bag, 3 pale silver bags.\n" +
            "wavy plum bags contain 4 light teal bags, 4 shiny aqua bags, 2 light olive bags, 4 light blue bags.\n" +
            "striped turquoise bags contain 2 pale salmon bags, 3 muted orange bags, 3 posh lavender bags.\n" +
            "mirrored turquoise bags contain 3 vibrant lavender bags.\n" +
            "clear gray bags contain 3 dark cyan bags, 2 mirrored red bags, 2 wavy teal bags.\n" +
            "wavy violet bags contain 1 dark fuchsia bag.\n" +
            "clear crimson bags contain 1 pale red bag.\n" +
            "faded purple bags contain 1 shiny black bag, 2 mirrored white bags.\n" +
            "bright white bags contain 5 dotted maroon bags, 1 wavy aqua bag.\n" +
            "pale bronze bags contain 5 dull teal bags.\n" +
            "bright teal bags contain 1 mirrored aqua bag, 5 drab fuchsia bags.\n" +
            "posh silver bags contain 5 dim gray bags, 5 vibrant beige bags, 2 muted green bags.\n" +
            "posh chartreuse bags contain 3 pale brown bags.\n" +
            "dotted purple bags contain 5 faded indigo bags, 4 drab magenta bags, 5 shiny chartreuse bags, 3 faded maroon bags.\n" +
            "dim fuchsia bags contain 3 light blue bags, 3 muted yellow bags.\n" +
            "dark coral bags contain 4 dull crimson bags, 3 muted brown bags.\n" +
            "faded crimson bags contain 1 muted teal bag.\n" +
            "mirrored orange bags contain 3 dull bronze bags, 5 dull gold bags, 4 dim gray bags, 1 dotted green bag.\n" +
            "faded aqua bags contain 1 light gray bag.\n" +
            "vibrant magenta bags contain 1 dark aqua bag.\n" +
            "light fuchsia bags contain 4 light orange bags, 5 muted chartreuse bags, 3 wavy tomato bags, 1 dotted violet bag.\n" +
            "light coral bags contain 5 plaid tan bags.\n" +
            "dim lavender bags contain 1 pale purple bag.\n" +
            "shiny gray bags contain 5 shiny purple bags, 5 vibrant green bags, 1 bright cyan bag, 5 light blue bags.\n" +
            "dim turquoise bags contain no other bags.\n" +
            "wavy turquoise bags contain 1 light white bag, 4 posh magenta bags, 5 dim magenta bags.\n" +
            "dim salmon bags contain 5 faded violet bags, 1 faded lime bag.\n" +
            "wavy bronze bags contain 4 plaid magenta bags.\n" +
            "clear black bags contain 1 shiny lavender bag.\n" +
            "striped magenta bags contain 5 shiny cyan bags, 3 dotted purple bags, 4 striped silver bags, 3 light coral bags.\n" +
            "striped gray bags contain 3 faded plum bags, 2 striped fuchsia bags, 1 dim gray bag.\n" +
            "wavy cyan bags contain 1 striped indigo bag.\n" +
            "faded fuchsia bags contain 2 striped fuchsia bags.\n" +
            "plaid blue bags contain 2 dark brown bags, 5 drab gray bags, 5 plaid olive bags, 1 dark aqua bag.\n" +
            "pale red bags contain 5 clear aqua bags, 2 dim turquoise bags, 5 drab gray bags, 4 faded turquoise bags.\n" +
            "dim tan bags contain no other bags.\n" +
            "wavy fuchsia bags contain 2 dull lime bags, 1 drab fuchsia bag, 3 drab indigo bags.\n" +
            "drab gold bags contain 4 bright salmon bags, 2 shiny fuchsia bags, 4 faded lime bags, 5 plaid magenta bags.\n" +
            "pale lavender bags contain 1 wavy beige bag, 2 striped olive bags.\n" +
            "muted olive bags contain 5 striped fuchsia bags, 1 drab silver bag, 3 dotted lavender bags.\n" +
            "shiny magenta bags contain 3 clear orange bags, 2 plaid silver bags, 5 bright turquoise bags, 4 shiny orange bags.\n" +
            "muted blue bags contain 3 dark gray bags, 3 drab blue bags, 4 dark gold bags, 5 bright tomato bags.\n" +
            "dotted red bags contain 4 striped plum bags, 5 shiny aqua bags, 2 clear red bags.\n" +
            "vibrant tomato bags contain 3 wavy white bags, 1 mirrored lime bag, 1 dark fuchsia bag.\n" +
            "dull silver bags contain 4 posh black bags, 3 dark gray bags, 3 pale plum bags.\n" +
            "dark chartreuse bags contain 3 dull blue bags, 1 dim tan bag.\n" +
            "clear gold bags contain 3 muted magenta bags, 3 dim teal bags, 4 vibrant olive bags, 1 vibrant salmon bag.\n" +
            "posh teal bags contain 4 wavy red bags.\n" +
            "pale blue bags contain 1 dim red bag, 4 clear silver bags, 2 dull salmon bags, 4 vibrant salmon bags.\n" +
            "dotted gray bags contain 4 vibrant bronze bags, 4 dark maroon bags, 4 muted lavender bags.\n" +
            "dotted magenta bags contain 2 dull purple bags, 4 dim gold bags, 5 drab gray bags, 4 faded bronze bags.\n" +
            "faded gold bags contain 2 clear black bags, 3 pale tomato bags, 3 wavy aqua bags.\n" +
            "light turquoise bags contain 2 bright tan bags, 2 muted chartreuse bags.\n" +
            "muted green bags contain 4 muted gold bags, 4 posh black bags, 1 striped fuchsia bag, 1 dotted blue bag.\n" +
            "light beige bags contain 5 muted olive bags.\n" +
            "striped brown bags contain 4 bright white bags, 1 pale teal bag.\n" +
            "vibrant blue bags contain 4 clear aqua bags, 2 striped green bags, 1 faded indigo bag.\n" +
            "dim purple bags contain 4 bright coral bags, 2 posh yellow bags.\n" +
            "dim aqua bags contain 3 faded plum bags, 2 dim red bags.\n" +
            "clear salmon bags contain 2 drab gray bags, 1 mirrored cyan bag.\n" +
            "plaid tan bags contain 5 muted yellow bags, 1 bright brown bag.\n" +
            "striped green bags contain 2 drab cyan bags, 5 dim gray bags.\n" +
            "dark gray bags contain 3 muted teal bags, 1 clear violet bag, 5 bright cyan bags.\n" +
            "clear lavender bags contain 1 dark red bag, 1 wavy blue bag, 2 plaid silver bags.\n" +
            "vibrant gold bags contain 5 dark brown bags.\n" +
            "drab indigo bags contain 3 wavy aqua bags, 3 mirrored indigo bags, 5 dull brown bags.\n" +
            "light white bags contain 2 dull plum bags, 2 drab orange bags.\n" +
            "posh orange bags contain 4 wavy plum bags, 2 posh tan bags, 1 bright blue bag, 4 muted red bags.\n" +
            "drab red bags contain 2 mirrored maroon bags, 4 light coral bags.\n" +
            "muted silver bags contain 5 muted maroon bags, 3 clear fuchsia bags, 3 dark gold bags.\n" +
            "plaid olive bags contain 1 posh red bag, 1 pale crimson bag, 5 shiny tomato bags.\n" +
            "light tan bags contain 1 dull bronze bag, 2 dim lavender bags.\n" +
            "plaid white bags contain 3 dim turquoise bags.\n" +
            "pale aqua bags contain 1 vibrant crimson bag, 3 striped silver bags, 3 bright lavender bags, 3 shiny white bags.\n" +
            "bright tomato bags contain 5 drab purple bags, 1 shiny black bag, 4 wavy turquoise bags.\n" +
            "dotted green bags contain 3 dim cyan bags, 4 faded violet bags.\n" +
            "faded silver bags contain 1 shiny violet bag, 5 faded lavender bags.\n" +
            "vibrant cyan bags contain 1 bright green bag, 4 muted teal bags, 3 clear salmon bags.\n" +
            "mirrored blue bags contain 2 muted teal bags, 4 posh crimson bags, 2 dim indigo bags, 1 clear black bag.\n" +
            "faded olive bags contain 3 faded fuchsia bags, 3 dotted maroon bags, 5 wavy red bags, 4 plaid chartreuse bags.\n" +
            "striped lavender bags contain 2 vibrant salmon bags, 5 bright black bags, 5 dull blue bags.\n" +
            "bright green bags contain 2 muted maroon bags, 3 dim orange bags.\n" +
            "striped teal bags contain 4 light brown bags, 5 plaid brown bags, 4 clear turquoise bags.\n" +
            "posh yellow bags contain 1 pale teal bag, 5 dark crimson bags.\n" +
            "clear cyan bags contain 1 muted silver bag, 5 shiny white bags, 4 dotted white bags, 2 striped fuchsia bags.\n" +
            "drab tan bags contain 3 vibrant bronze bags, 1 pale white bag.\n" +
            "muted chartreuse bags contain 1 clear white bag, 1 shiny violet bag, 5 bright fuchsia bags.\n" +
            "drab aqua bags contain 3 mirrored tan bags.\n" +
            "vibrant gray bags contain 2 mirrored salmon bags, 3 dotted brown bags, 3 wavy maroon bags, 4 shiny maroon bags.\n" +
            "faded teal bags contain 2 drab gray bags, 1 dim gold bag, 4 drab orange bags, 5 clear violet bags.\n" +
            "wavy red bags contain 4 drab coral bags, 4 dotted lavender bags, 5 dim turquoise bags.\n" +
            "dull white bags contain 3 mirrored green bags, 5 dim turquoise bags.\n" +
            "dotted chartreuse bags contain 1 dotted green bag, 4 dull blue bags, 1 striped indigo bag, 5 dim tomato bags.\n" +
            "posh maroon bags contain 2 dull salmon bags, 5 clear bronze bags, 5 bright cyan bags, 5 clear silver bags.\n" +
            "faded white bags contain 4 drab gray bags, 4 dim gray bags.\n" +
            "striped black bags contain 1 bright salmon bag, 3 faded white bags, 3 dark magenta bags, 1 muted plum bag.\n" +
            "striped indigo bags contain 3 shiny tomato bags, 2 mirrored olive bags.\n" +
            "striped white bags contain 4 vibrant maroon bags.\n" +
            "dim gray bags contain 2 dull gold bags.\n" +
            "faded coral bags contain 5 mirrored lavender bags, 2 vibrant plum bags.\n" +
            "mirrored tomato bags contain 5 light yellow bags, 2 drab orange bags.\n" +
            "dotted tan bags contain 2 posh plum bags, 2 pale teal bags, 2 pale maroon bags.\n" +
            "dotted turquoise bags contain 5 mirrored crimson bags, 2 dull orange bags.\n" +
            "dim yellow bags contain 2 bright cyan bags, 3 dim turquoise bags, 2 mirrored green bags.\n" +
            "vibrant crimson bags contain 5 posh maroon bags.\n" +
            "pale crimson bags contain 4 clear black bags, 5 dull crimson bags, 5 dotted green bags.\n" +
            "light indigo bags contain 3 clear black bags.\n" +
            "plaid cyan bags contain 3 plaid tan bags, 3 drab coral bags.\n" +
            "drab bronze bags contain 5 dull teal bags, 3 plaid coral bags, 2 faded beige bags, 4 plaid aqua bags.\n" +
            "drab orange bags contain 1 mirrored green bag.\n" +
            "mirrored lime bags contain 1 shiny gray bag, 3 dim indigo bags.\n" +
            "posh aqua bags contain 4 muted tan bags, 2 faded yellow bags.\n" +
            "light purple bags contain 2 shiny chartreuse bags, 2 dim gray bags, 5 pale red bags.\n" +
            "dull teal bags contain 3 posh crimson bags, 1 dotted blue bag, 3 muted yellow bags.\n" +
            "vibrant red bags contain 4 faded white bags, 5 dim tan bags, 4 shiny lavender bags, 1 dim turquoise bag.\n" +
            "dull cyan bags contain 1 dotted silver bag, 5 striped olive bags, 5 faded gray bags, 1 dark green bag.\n" +
            "dim crimson bags contain 1 posh lime bag, 1 dark salmon bag.\n" +
            "light violet bags contain 5 posh brown bags.\n" +
            "clear orange bags contain 2 light olive bags, 4 faded turquoise bags, 4 drab gray bags, 2 mirrored olive bags.\n" +
            "dotted crimson bags contain 4 pale magenta bags, 5 muted red bags, 4 shiny yellow bags.\n" +
            "posh gray bags contain 4 dull lavender bags, 4 dim gray bags.\n" +
            "faded tomato bags contain 3 striped salmon bags, 1 bright lime bag, 4 vibrant magenta bags.\n" +
            "clear bronze bags contain 5 bright plum bags, 1 dim beige bag, 1 dim cyan bag, 5 dotted blue bags.\n" +
            "clear fuchsia bags contain 3 vibrant olive bags, 3 pale crimson bags, 4 wavy maroon bags, 4 drab olive bags.\n" +
            "bright violet bags contain 3 faded blue bags.\n" +
            "muted brown bags contain 1 muted lavender bag.\n" +
            "faded turquoise bags contain 3 dull gold bags, 3 muted orange bags, 4 light blue bags, 1 dotted gray bag.\n" +
            "dim indigo bags contain 5 muted maroon bags.\n" +
            "plaid black bags contain 4 plaid teal bags, 5 vibrant green bags.\n" +
            "dull purple bags contain 2 shiny gold bags, 4 dim gray bags.\n" +
            "dull crimson bags contain 1 dull gold bag, 4 vibrant aqua bags.\n" +
            "light aqua bags contain 5 mirrored orange bags, 4 wavy aqua bags.\n" +
            "pale lime bags contain 4 drab coral bags, 3 vibrant chartreuse bags, 4 posh crimson bags.\n" +
            "faded plum bags contain 1 muted brown bag, 4 dull bronze bags, 1 plaid white bag, 1 drab blue bag.\n" +
            "clear silver bags contain 4 muted gray bags, 5 mirrored maroon bags, 1 clear violet bag.\n" +
            "light brown bags contain 4 shiny maroon bags, 1 drab lavender bag, 5 dark violet bags, 4 dull green bags.\n" +
            "light crimson bags contain 4 light magenta bags, 3 mirrored blue bags, 1 pale tomato bag, 1 muted tomato bag.\n" +
            "plaid orange bags contain 4 dull silver bags.\n" +
            "muted black bags contain 2 dull tomato bags, 5 mirrored teal bags.\n" +
            "dotted bronze bags contain 4 dim tan bags.\n" +
            "drab tomato bags contain 4 muted lime bags, 2 striped cyan bags.\n" +
            "clear indigo bags contain 5 dull lavender bags, 4 dark indigo bags.\n" +
            "pale purple bags contain 5 dim beige bags, 5 shiny tomato bags, 3 mirrored olive bags, 5 muted lavender bags.\n" +
            "mirrored silver bags contain 4 vibrant maroon bags.\n" +
            "bright aqua bags contain 5 bright olive bags, 2 drab magenta bags, 2 dim teal bags.\n" +
            "wavy magenta bags contain 3 clear fuchsia bags, 3 mirrored gray bags, 4 dull fuchsia bags.\n" +
            "dull blue bags contain 5 drab coral bags, 5 drab chartreuse bags.\n" +
            "dim plum bags contain 1 muted magenta bag, 3 shiny lavender bags.\n" +
            "muted bronze bags contain 3 posh white bags, 5 clear black bags, 3 mirrored lime bags.\n" +
            "drab cyan bags contain 1 drab blue bag.\n" +
            "faded tan bags contain 4 pale plum bags.\n" +
            "posh violet bags contain 2 dim silver bags.\n" +
            "posh blue bags contain 5 clear yellow bags, 3 light indigo bags.\n" +
            "muted orange bags contain 5 drab gray bags, 1 dim turquoise bag.\n" +
            "bright lavender bags contain 1 drab cyan bag.\n" +
            "clear brown bags contain 2 shiny teal bags.\n" +
            "light maroon bags contain 4 dim fuchsia bags, 1 light yellow bag, 3 pale magenta bags.\n" +
            "muted indigo bags contain 4 shiny gold bags, 1 clear teal bag, 4 light gray bags, 2 shiny orange bags.\n" +
            "striped red bags contain 4 wavy blue bags, 1 vibrant maroon bag, 5 shiny yellow bags.\n" +
            "drab olive bags contain 2 dull blue bags, 5 pale coral bags, 1 vibrant salmon bag, 1 dotted green bag.\n" +
            "dotted aqua bags contain 5 dim aqua bags, 1 drab olive bag, 5 dim violet bags, 2 light plum bags.\n" +
            "dull indigo bags contain 5 vibrant gold bags.\n" +
            "drab turquoise bags contain 3 pale salmon bags, 1 shiny violet bag, 1 shiny orange bag, 1 mirrored olive bag.\n" +
            "bright turquoise bags contain 1 dotted green bag.\n" +
            "bright tan bags contain 5 faded cyan bags, 5 mirrored aqua bags, 3 dim orange bags.\n" +
            "bright chartreuse bags contain 1 dim bronze bag, 3 posh bronze bags, 3 drab salmon bags.\n" +
            "vibrant orange bags contain 3 dim fuchsia bags, 3 dull crimson bags, 5 vibrant salmon bags.\n" +
            "bright lime bags contain 3 posh tomato bags, 4 striped indigo bags, 1 dull white bag, 2 light plum bags.\n" +
            "dark black bags contain 1 muted aqua bag.\n" +
            "pale silver bags contain 2 dull fuchsia bags, 2 dark maroon bags.\n" +
            "dotted maroon bags contain 2 drab olive bags.\n" +
            "shiny gold bags contain 2 dim beige bags, 1 dark maroon bag, 4 light blue bags.\n" +
            "posh lime bags contain 1 shiny green bag, 3 drab purple bags, 3 vibrant blue bags.\n" +
            "vibrant violet bags contain 5 dim silver bags, 4 dotted maroon bags, 5 drab fuchsia bags, 5 clear plum bags.\n" +
            "bright silver bags contain 2 drab coral bags, 5 mirrored red bags, 5 drab fuchsia bags.\n" +
            "dark purple bags contain 1 drab chartreuse bag, 1 posh lavender bag, 1 clear blue bag.\n" +
            "light green bags contain 1 dark plum bag, 5 dull olive bags, 4 shiny lavender bags.\n" +
            "dull beige bags contain 5 light indigo bags.\n" +
            "muted gold bags contain 2 mirrored magenta bags, 5 shiny orange bags, 5 drab lavender bags.\n" +
            "plaid gold bags contain 4 dark crimson bags, 3 dotted crimson bags.\n" +
            "plaid silver bags contain 2 dotted blue bags, 1 vibrant aqua bag, 2 shiny chartreuse bags.\n" +
            "vibrant green bags contain 5 posh brown bags, 3 light gray bags, 2 wavy blue bags.\n" +
            "posh crimson bags contain 2 dim turquoise bags, 3 dim tan bags, 4 dotted lavender bags.\n" +
            "bright coral bags contain 1 faded chartreuse bag.\n" +
            "shiny teal bags contain 2 muted orange bags, 5 muted olive bags, 5 mirrored olive bags.\n" +
            "posh brown bags contain 4 posh crimson bags.\n" +
            "pale white bags contain 5 dark coral bags, 3 dim tomato bags, 3 wavy indigo bags.\n" +
            "clear olive bags contain 1 bright plum bag.\n" +
            "dotted violet bags contain 3 posh plum bags.\n" +
            "vibrant salmon bags contain 3 dim beige bags, 2 light gray bags, 2 wavy red bags, 5 dull brown bags.\n" +
            "dotted indigo bags contain 1 dull maroon bag.\n" +
            "clear lime bags contain 5 posh maroon bags, 1 muted coral bag, 5 wavy maroon bags, 3 muted orange bags.\n" +
            "posh cyan bags contain 3 posh black bags, 4 drab black bags.\n" +
            "striped blue bags contain 5 dim yellow bags, 1 wavy chartreuse bag.\n" +
            "dark cyan bags contain 1 faded blue bag.\n" +
            "clear magenta bags contain 3 muted green bags, 5 dotted aqua bags, 2 posh gray bags.\n" +
            "dull lime bags contain 4 dotted lavender bags, 3 dim cyan bags, 4 dim tan bags.\n" +
            "pale brown bags contain 3 dim gray bags.\n" +
            "dull violet bags contain 2 posh tomato bags, 2 clear blue bags, 2 drab silver bags, 4 muted gray bags.\n" +
            "dark tan bags contain 2 dim cyan bags, 4 dotted lavender bags.\n" +
            "dotted black bags contain 3 plaid olive bags, 3 posh plum bags, 3 wavy turquoise bags, 5 muted teal bags.\n" +
            "muted cyan bags contain 2 shiny tan bags, 1 bright aqua bag, 4 dotted lavender bags, 3 vibrant crimson bags.\n" +
            "clear green bags contain 1 dotted violet bag, 3 dotted bronze bags, 1 clear bronze bag.\n" +
            "bright olive bags contain 4 muted orange bags, 3 dotted orange bags.\n" +
            "dull turquoise bags contain 1 faded lavender bag, 5 dark blue bags, 3 striped cyan bags.\n" +
            "mirrored plum bags contain 5 dull violet bags, 3 faded turquoise bags.\n" +
            "plaid lavender bags contain 2 striped green bags, 2 posh magenta bags, 3 drab cyan bags, 3 bright plum bags.\n" +
            "clear yellow bags contain 1 mirrored green bag, 2 dotted blue bags.\n" +
            "light gold bags contain 3 dark blue bags.\n" +
            "dark gold bags contain 1 light aqua bag.\n" +
            "drab crimson bags contain 2 posh coral bags, 1 shiny red bag.\n" +
            "faded chartreuse bags contain 2 vibrant red bags, 4 vibrant aqua bags, 5 pale purple bags, 5 mirrored olive bags.\n" +
            "bright plum bags contain 2 pale tan bags.\n" +
            "muted crimson bags contain 3 dotted orange bags, 4 bright orange bags, 3 drab maroon bags, 2 vibrant turquoise bags.\n" +
            "dim black bags contain 3 shiny green bags, 5 mirrored gold bags, 2 wavy fuchsia bags.\n" +
            "pale gold bags contain 2 wavy silver bags, 3 muted magenta bags.\n" +
            "wavy black bags contain 2 dim beige bags, 1 clear bronze bag, 5 shiny gray bags.\n" +
            "dim green bags contain 1 wavy maroon bag.\n" +
            "dull tomato bags contain 4 mirrored red bags, 1 dark violet bag, 2 posh magenta bags, 1 light indigo bag.\n" +
            "clear beige bags contain 1 posh coral bag, 4 dim silver bags, 1 wavy turquoise bag, 4 bright white bags.\n" +
            "posh red bags contain 5 dim cyan bags.\n" +
            "dark turquoise bags contain 1 dark cyan bag, 3 light blue bags.\n" +
            "clear maroon bags contain 2 mirrored white bags, 5 dull plum bags, 3 dull beige bags.\n" +
            "light silver bags contain 4 shiny violet bags, 4 posh indigo bags, 1 wavy white bag.\n" +
            "muted salmon bags contain 3 dim lime bags, 2 shiny violet bags, 2 dark green bags, 1 mirrored chartreuse bag.\n" +
            "muted plum bags contain 3 bright coral bags, 5 posh indigo bags, 4 bright gray bags.\n" +
            "dim orange bags contain 5 mirrored brown bags, 4 dim turquoise bags.\n" +
            "light gray bags contain 2 light blue bags, 2 pale purple bags.\n" +
            "mirrored magenta bags contain 5 pale coral bags, 1 dark crimson bag.\n" +
            "drab lavender bags contain 3 clear yellow bags.\n" +
            "striped tan bags contain 1 dotted black bag, 1 dull crimson bag.\n" +
            "wavy aqua bags contain 1 muted teal bag.\n" +
            "light olive bags contain 4 drab magenta bags.\n" +
            "bright indigo bags contain 1 mirrored gray bag, 4 vibrant red bags, 3 dim tomato bags.\n" +
            "dotted yellow bags contain 1 drab olive bag, 4 pale crimson bags, 4 drab gray bags, 2 striped fuchsia bags.\n" +
            "mirrored lavender bags contain 3 drab coral bags, 3 dim indigo bags, 4 dim gold bags, 5 wavy salmon bags.\n" +
            "muted white bags contain 5 bright brown bags, 5 bright plum bags, 1 dull gold bag.\n" +
            "posh fuchsia bags contain 3 dotted aqua bags.\n" +
            "dotted brown bags contain 4 dim turquoise bags, 1 dotted gray bag, 3 dark magenta bags, 2 bright coral bags.\n" +
            "shiny bronze bags contain 4 mirrored indigo bags, 2 wavy turquoise bags, 2 wavy blue bags, 3 mirrored beige bags.\n" +
            "vibrant teal bags contain 1 dark violet bag, 3 wavy blue bags, 1 dull fuchsia bag.\n" +
            "plaid indigo bags contain 4 vibrant magenta bags, 2 dull cyan bags.\n" +
            "muted turquoise bags contain 5 dark magenta bags, 5 drab gray bags, 4 plaid red bags.\n" +
            "striped bronze bags contain 5 bright white bags, 2 clear bronze bags, 3 bright silver bags.\n" +
            "posh salmon bags contain 4 drab maroon bags, 3 mirrored bronze bags, 4 faded plum bags.\n" +
            "light magenta bags contain 5 dark purple bags, 3 plaid silver bags.\n" +
            "dull fuchsia bags contain 3 posh red bags, 4 dark coral bags, 2 dark aqua bags.\n" +
            "vibrant aqua bags contain 3 drab coral bags, 3 dim cyan bags, 5 dim tan bags.\n" +
            "muted red bags contain 3 plaid teal bags, 1 posh coral bag, 3 posh plum bags.\n" +
            "drab yellow bags contain 3 bright brown bags, 3 mirrored aqua bags.\n" +
            "dim cyan bags contain no other bags.\n" +
            "shiny yellow bags contain 4 wavy red bags, 2 dotted blue bags.\n" +
            "bright maroon bags contain 4 drab gray bags, 1 mirrored olive bag, 5 faded white bags.\n" +
            "dark crimson bags contain 4 drab orange bags, 5 vibrant red bags, 1 pale purple bag.\n" +
            "shiny cyan bags contain 4 faded plum bags, 4 faded teal bags, 1 posh indigo bag.\n" +
            "posh olive bags contain 1 dark tan bag, 1 drab green bag, 5 pale cyan bags, 4 vibrant turquoise bags.\n" +
            "dull chartreuse bags contain 3 shiny chartreuse bags, 3 striped brown bags, 2 mirrored blue bags, 3 pale coral bags.\n" +
            "dim bronze bags contain 4 muted olive bags.\n" +
            "faded orange bags contain 2 vibrant red bags.\n" +
            "dim violet bags contain 1 posh red bag, 5 plaid tan bags.\n" +
            "wavy indigo bags contain 2 bright olive bags, 3 shiny red bags, 4 clear blue bags.\n" +
            "dull coral bags contain 4 faded magenta bags, 1 plaid lime bag, 2 dotted red bags.\n" +
            "dotted white bags contain 2 mirrored purple bags, 4 faded cyan bags, 1 vibrant salmon bag.\n" +
            "shiny crimson bags contain 5 mirrored magenta bags, 2 plaid silver bags, 3 vibrant brown bags, 2 vibrant orange bags.\n" +
            "bright magenta bags contain 1 light silver bag, 1 striped salmon bag, 4 dark gold bags, 5 faded lime bags.\n" +
            "dotted salmon bags contain 5 dim purple bags, 4 dull indigo bags, 2 pale turquoise bags.\n" +
            "clear purple bags contain 2 clear coral bags, 2 muted green bags, 5 clear maroon bags.\n" +
            "mirrored purple bags contain 4 drab silver bags, 1 wavy aqua bag, 1 shiny teal bag.\n" +
            "wavy teal bags contain 5 dull salmon bags, 2 bright coral bags, 2 bright plum bags.\n" +
            "shiny red bags contain 4 dull indigo bags, 4 pale coral bags, 3 wavy blue bags.\n" +
            "wavy tan bags contain 5 faded turquoise bags, 2 posh tomato bags, 4 dark green bags, 4 dull crimson bags.\n" +
            "wavy crimson bags contain 3 vibrant gold bags, 3 drab magenta bags, 3 dull salmon bags.\n" +
            "wavy olive bags contain 2 pale blue bags, 1 dull gold bag, 3 clear aqua bags, 1 mirrored gray bag.\n" +
            "shiny salmon bags contain 2 mirrored aqua bags, 3 mirrored tan bags, 1 wavy blue bag.\n" +
            "dark plum bags contain 1 faded salmon bag, 1 faded plum bag, 3 pale tan bags.\n" +
            "mirrored yellow bags contain 3 clear lime bags.\n" +
            "dark lavender bags contain 5 muted teal bags, 5 shiny bronze bags.\n" +
            "pale tomato bags contain 2 clear silver bags, 3 shiny green bags, 2 mirrored blue bags, 4 vibrant beige bags.\n" +
            "dotted cyan bags contain 4 light gray bags.\n" +
            "wavy silver bags contain 4 drab teal bags, 5 vibrant maroon bags, 4 wavy teal bags, 4 striped turquoise bags.\n" +
            "vibrant brown bags contain 5 striped gray bags, 1 bright turquoise bag.\n" +
            "mirrored salmon bags contain 1 bright salmon bag, 4 drab lavender bags.\n" +
            "striped violet bags contain 5 drab teal bags.\n" +
            "bright gold bags contain 4 clear blue bags, 2 dull gray bags, 1 striped red bag, 5 muted indigo bags.\n" +
            "faded cyan bags contain 5 dark green bags.\n" +
            "plaid fuchsia bags contain 2 posh blue bags.\n" +
            "posh green bags contain 4 striped cyan bags, 2 bright lime bags, 1 dotted black bag, 5 dim silver bags.\n" +
            "dull plum bags contain 4 striped fuchsia bags.\n" +
            "dull brown bags contain 1 faded bronze bag, 5 posh tomato bags, 1 muted gray bag.\n" +
            "dull aqua bags contain 1 light blue bag, 1 vibrant bronze bag, 1 posh brown bag.\n" +
            "clear plum bags contain 4 clear silver bags, 2 bright beige bags, 5 mirrored red bags, 2 dull magenta bags.\n" +
            "dull orange bags contain 1 light blue bag, 5 shiny maroon bags.\n" +
            "wavy maroon bags contain 3 dotted gray bags, 3 faded indigo bags, 3 dim cyan bags.\n" +
            "plaid teal bags contain 2 dotted blue bags, 5 vibrant olive bags, 5 faded orange bags.\n" +
            "muted gray bags contain 1 dim tan bag, 1 shiny tomato bag, 3 vibrant bronze bags, 1 drab coral bag.\n" +
            "plaid aqua bags contain 3 mirrored tan bags, 2 mirrored green bags, 2 dark gray bags, 4 dotted blue bags.\n" +
            "striped beige bags contain 4 clear salmon bags.\n" +
            "faded beige bags contain 4 vibrant red bags, 3 pale tan bags.\n" +
            "pale salmon bags contain 3 mirrored chartreuse bags, 3 striped salmon bags, 4 faded blue bags.\n" +
            "plaid turquoise bags contain 3 shiny lavender bags, 3 faded beige bags.\n" +
            "muted fuchsia bags contain 3 muted indigo bags, 3 vibrant red bags, 4 dim lavender bags, 4 dull teal bags.\n" +
            "drab black bags contain 5 dark beige bags, 3 mirrored olive bags, 3 faded turquoise bags.\n" +
            "shiny fuchsia bags contain 3 muted brown bags, 4 dim beige bags.\n" +
            "shiny maroon bags contain 2 dark bronze bags, 2 bright salmon bags, 5 striped cyan bags.\n" +
            "shiny lavender bags contain 3 muted orange bags, 1 bright plum bag, 5 muted lavender bags.\n" +
            "bright gray bags contain 1 plaid tan bag, 2 dotted gray bags.\n" +
            "striped purple bags contain 5 posh black bags, 2 striped fuchsia bags, 3 mirrored magenta bags, 3 dark tan bags.\n" +
            "faded red bags contain 5 posh coral bags, 3 dim silver bags, 2 bright black bags, 3 muted green bags.\n" +
            "dim blue bags contain 5 drab purple bags.\n" +
            "dotted gold bags contain 5 pale coral bags, 5 dim bronze bags.\n" +
            "bright crimson bags contain 2 clear purple bags, 2 plaid yellow bags, 4 muted fuchsia bags.\n" +
            "dull gold bags contain no other bags.\n" +
            "mirrored teal bags contain 4 wavy maroon bags, 1 faded magenta bag, 2 wavy teal bags, 2 vibrant salmon bags.\n" +
            "dotted lavender bags contain no other bags.\n" +
            "muted aqua bags contain 4 muted tan bags.\n" +
            "vibrant black bags contain 3 plaid white bags.\n" +
            "pale maroon bags contain 3 dotted cyan bags, 4 posh brown bags, 1 bright salmon bag.\n" +
            "dark maroon bags contain 1 shiny tomato bag, 2 mirrored white bags, 2 posh red bags.\n" +
            "pale magenta bags contain 4 vibrant red bags, 3 bright cyan bags.\n" +
            "posh lavender bags contain 5 dim silver bags, 3 striped indigo bags, 3 muted gray bags, 3 dull violet bags.\n" +
            "striped chartreuse bags contain 2 shiny chartreuse bags, 5 drab gray bags, 2 dotted brown bags, 1 plaid coral bag.\n" +
            "muted teal bags contain 5 clear black bags, 1 light white bag, 4 posh crimson bags, 4 faded beige bags.\n" +
            "mirrored chartreuse bags contain 1 bright silver bag, 1 light plum bag, 2 drab purple bags.\n" +
            "dim lime bags contain 1 dotted gray bag, 4 muted olive bags, 2 muted gray bags.\n" +
            "drab violet bags contain 1 plaid fuchsia bag, 4 dull white bags, 3 posh beige bags.\n" +
            "bright fuchsia bags contain 1 pale turquoise bag, 5 dotted cyan bags.\n" +
            "striped lime bags contain 3 light blue bags, 4 drab fuchsia bags, 5 light aqua bags, 1 dim indigo bag.\n" +
            "wavy lavender bags contain 4 dull violet bags.\n" +
            "drab maroon bags contain 1 pale brown bag, 1 pale purple bag.\n" +
            "clear chartreuse bags contain 4 faded fuchsia bags, 2 light gray bags, 3 vibrant maroon bags, 3 posh lavender bags.\n" +
            "clear teal bags contain 1 faded teal bag, 4 muted white bags.\n" +
            "dull black bags contain 1 pale blue bag, 2 shiny green bags, 3 plaid plum bags, 2 faded turquoise bags.\n" +
            "dark olive bags contain 1 faded tan bag, 3 dim beige bags, 4 dark chartreuse bags, 5 light yellow bags.\n" +
            "faded green bags contain 4 striped green bags, 5 dotted blue bags, 3 striped beige bags.\n" +
            "drab green bags contain 1 clear aqua bag, 4 light plum bags.\n" +
            "mirrored green bags contain no other bags.\n" +
            "posh black bags contain 4 striped cyan bags, 2 dim tan bags, 5 drab blue bags, 5 faded white bags.\n" +
            "muted magenta bags contain 2 vibrant aqua bags.\n" +
            "mirrored brown bags contain 4 wavy turquoise bags, 1 dull magenta bag, 1 dim silver bag, 2 dim gray bags.\n" +
            "plaid brown bags contain 5 mirrored brown bags, 4 mirrored lime bags, 1 clear red bag.\n" +
            "posh white bags contain 5 clear bronze bags, 5 faded maroon bags, 3 light lavender bags.\n" +
            "posh turquoise bags contain 1 pale tan bag, 1 dark purple bag, 4 shiny white bags, 2 drab brown bags.\n" +
            "dim brown bags contain 2 drab coral bags.\n" +
            "plaid violet bags contain 4 clear lavender bags, 4 drab maroon bags, 4 muted maroon bags, 1 bright red bag.\n" +
            "posh coral bags contain 1 shiny gold bag, 4 dim red bags, 5 dull aqua bags.\n" +
            "bright black bags contain 2 dull teal bags.\n" +
            "plaid bronze bags contain 1 bright orange bag, 5 wavy turquoise bags, 5 vibrant beige bags.\n" +
            "drab plum bags contain 2 bright lime bags.\n" +
            "shiny green bags contain 5 wavy blue bags, 4 bright lime bags.\n" +
            "drab teal bags contain 1 wavy aqua bag, 2 mirrored gray bags, 5 dim lavender bags.\n" +
            "bright blue bags contain 4 muted purple bags, 3 bright fuchsia bags, 5 muted maroon bags.\n" +
            "shiny chartreuse bags contain 2 clear violet bags, 3 posh coral bags, 2 drab chartreuse bags, 2 pale silver bags.\n" +
            "faded lavender bags contain 5 dim lavender bags, 1 dim turquoise bag, 1 vibrant magenta bag.\n" +
            "dim coral bags contain 3 faded teal bags, 3 faded indigo bags.\n" +
            "striped maroon bags contain 1 shiny aqua bag, 3 vibrant magenta bags, 5 light maroon bags, 2 dull aqua bags.\n" +
            "striped plum bags contain 1 dotted brown bag, 3 wavy green bags, 2 mirrored tomato bags.\n" +
            "drab lime bags contain 2 wavy teal bags, 3 dim maroon bags, 1 dark cyan bag.\n" +
            "muted coral bags contain 4 dim maroon bags, 5 drab lavender bags, 5 drab purple bags.\n" +
            "drab white bags contain 3 shiny cyan bags, 5 wavy aqua bags, 5 faded maroon bags.\n" +
            "dotted teal bags contain 3 muted indigo bags.\n" +
            "plaid coral bags contain 4 dotted aqua bags, 4 wavy salmon bags, 2 dim maroon bags.\n" +
            "bright salmon bags contain 5 dark cyan bags.\n" +
            "shiny blue bags contain 1 posh lime bag.\n" +
            "plaid red bags contain 1 dim maroon bag, 4 faded crimson bags, 2 muted plum bags.\n" +
            "dull olive bags contain 2 faded plum bags, 4 striped white bags, 4 wavy indigo bags.\n" +
            "shiny purple bags contain 2 drab coral bags, 5 pale blue bags.\n" +
            "striped olive bags contain 2 vibrant orange bags, 5 dim red bags, 1 dim cyan bag, 3 mirrored cyan bags.\n" +
            "dull magenta bags contain 2 vibrant yellow bags.\n" +
            "dull tan bags contain 2 mirrored green bags, 5 muted yellow bags, 4 faded turquoise bags.\n" +
            "vibrant plum bags contain 3 shiny olive bags, 1 dim indigo bag.\n" +
            "mirrored black bags contain 3 posh black bags, 4 vibrant tan bags, 1 vibrant black bag, 2 posh orange bags.\n" +
            "shiny black bags contain 3 muted white bags, 1 dim maroon bag, 2 dull salmon bags.\n" +
            "clear red bags contain 4 muted gray bags.\n" +
            "striped cyan bags contain 4 posh chartreuse bags, 4 dull brown bags, 2 posh tomato bags, 3 dark crimson bags.\n" +
            "faded violet bags contain 1 drab chartreuse bag, 1 dim turquoise bag, 2 mirrored olive bags, 2 clear tan bags.\n" +
            "muted beige bags contain 2 bright silver bags, 5 bright gold bags, 4 pale brown bags, 2 bright bronze bags.\n" +
            "pale black bags contain 5 vibrant green bags, 3 dark coral bags.\n" +
            "vibrant purple bags contain 4 dark brown bags, 3 clear violet bags, 1 wavy black bag, 2 faded fuchsia bags.\n" +
            "dark fuchsia bags contain 1 wavy salmon bag.\n" +
            "dark aqua bags contain 5 vibrant aqua bags, 5 dull blue bags.\n" +
            "pale coral bags contain 3 mirrored olive bags, 5 faded blue bags, 3 dim beige bags.\n" +
            "striped coral bags contain 4 shiny fuchsia bags, 1 plaid brown bag, 2 bright turquoise bags, 1 vibrant blue bag.\n" +
            "pale turquoise bags contain 3 dull green bags, 1 dim red bag.\n" +
            "pale teal bags contain 3 mirrored green bags, 1 faded violet bag, 3 vibrant green bags.\n" +
            "wavy beige bags contain 1 bright tomato bag, 2 dull olive bags, 3 dotted violet bags.\n" +
            "dark orange bags contain 2 posh salmon bags, 1 clear bronze bag.\n" +
            "shiny tomato bags contain 5 drab orange bags, 3 dull crimson bags, 4 clear tan bags, 5 faded blue bags.\n" +
            "mirrored fuchsia bags contain 2 bright maroon bags, 2 dim beige bags, 3 muted gold bags, 4 striped brown bags.\n" +
            "clear coral bags contain 5 dim brown bags, 1 drab lavender bag, 3 dull lime bags.\n" +
            "clear white bags contain 2 clear violet bags, 5 dull beige bags, 3 vibrant aqua bags, 4 dull blue bags.\n" +
            "dull maroon bags contain 5 dim salmon bags, 4 dim silver bags, 3 dark magenta bags.\n" +
            "drab silver bags contain 5 faded blue bags, 5 wavy chartreuse bags, 5 dull crimson bags, 5 muted yellow bags.\n" +
            "faded salmon bags contain 4 wavy olive bags, 3 mirrored salmon bags, 1 plaid violet bag.\n" +
            "drab salmon bags contain 4 dull magenta bags, 5 muted teal bags.\n" +
            "light yellow bags contain 1 pale coral bag, 4 dim turquoise bags, 4 mirrored maroon bags.\n" +
            "plaid crimson bags contain 3 dark violet bags, 2 dull gray bags.\n" +
            "dark tomato bags contain 1 posh teal bag, 1 posh lavender bag, 5 dim cyan bags, 4 light yellow bags.\n" +
            "dim chartreuse bags contain 5 muted plum bags, 4 vibrant aqua bags.\n" +
            "mirrored white bags contain 5 dull gold bags, 5 muted lavender bags, 2 dull crimson bags.\n" +
            "dotted blue bags contain 3 muted orange bags.\n" +
            "mirrored olive bags contain 5 posh crimson bags, 3 faded blue bags.\n" +
            "dim maroon bags contain 5 wavy aqua bags, 5 faded violet bags, 2 dull crimson bags, 2 posh lavender bags.\n" +
            "shiny indigo bags contain 5 dull lavender bags, 1 light white bag.\n" +
            "wavy chartreuse bags contain 3 mirrored white bags, 2 drab chartreuse bags, 5 muted orange bags, 4 dull crimson bags.\n" +
            "striped orange bags contain 4 shiny salmon bags.\n" +
            "dull green bags contain 4 muted gray bags, 4 drab gray bags, 3 clear yellow bags.\n" +
            "pale orange bags contain 5 posh turquoise bags, 3 light beige bags, 3 bright aqua bags, 5 dim bronze bags.\n" +
            "dim tomato bags contain 3 bright brown bags.\n" +
            "dull bronze bags contain 1 bright plum bag, 3 wavy red bags, 2 drab silver bags.\n" +
            "wavy blue bags contain 3 dull crimson bags, 4 light blue bags.\n" +
            "clear blue bags contain 1 dim gold bag, 4 dark crimson bags, 2 light gray bags, 4 muted olive bags.\n" +
            "clear turquoise bags contain 1 muted lime bag, 2 faded turquoise bags, 4 plaid lavender bags.\n" +
            "dark brown bags contain 3 dull gold bags, 5 bright cyan bags, 2 dull brown bags, 3 dark aqua bags.\n" +
            "plaid lime bags contain 3 dotted purple bags, 1 plaid blue bag, 3 bright silver bags, 1 vibrant chartreuse bag.\n" +
            "mirrored coral bags contain 2 plaid olive bags.\n" +
            "vibrant fuchsia bags contain 3 light indigo bags.\n" +
            "dim beige bags contain 1 muted lavender bag, 3 light blue bags.\n" +
            "wavy orange bags contain 5 dotted teal bags, 3 dull magenta bags, 4 clear chartreuse bags, 5 shiny violet bags.\n" +
            "vibrant lavender bags contain 3 vibrant orange bags, 1 dark aqua bag.\n" +
            "mirrored aqua bags contain 4 drab blue bags.\n" +
            "faded gray bags contain 1 wavy blue bag, 2 vibrant yellow bags, 1 light magenta bag.\n" +
            "dark green bags contain 2 wavy red bags.\n" +
            "dark red bags contain 5 drab magenta bags, 3 bright lime bags.\n" +
            "dark salmon bags contain 2 striped indigo bags, 5 wavy lavender bags, 1 dim fuchsia bag, 5 dim yellow bags.\n" +
            "wavy lime bags contain 2 striped plum bags, 3 faded brown bags.\n" +
            "muted violet bags contain 1 faded tomato bag.\n" +
            "faded bronze bags contain 2 dim gray bags, 3 muted gray bags.\n" +
            "vibrant beige bags contain 5 striped brown bags, 5 dull lime bags.\n" +
            "dotted coral bags contain 4 shiny brown bags, 1 bright silver bag, 2 clear yellow bags.\n" +
            "plaid maroon bags contain 3 shiny magenta bags, 3 faded tomato bags.\n" +
            "dim olive bags contain 3 light brown bags.\n" +
            "pale plum bags contain 4 pale tan bags, 1 drab silver bag, 3 dim beige bags.\n" +
            "vibrant chartreuse bags contain 4 mirrored white bags, 2 muted orange bags, 2 posh magenta bags.\n" +
            "faded indigo bags contain 3 bright brown bags, 3 dim tomato bags.\n" +
            "posh gold bags contain 3 dark silver bags, 4 mirrored gray bags, 4 dark salmon bags, 1 dim white bag.\n" +
            "light lavender bags contain 2 dark cyan bags.\n" +
            "plaid salmon bags contain 2 dotted green bags, 4 shiny indigo bags, 5 bright brown bags.\n" +
            "wavy white bags contain 2 dim lavender bags, 3 faded teal bags, 2 dull tan bags, 3 drab orange bags.\n" +
            "plaid plum bags contain 1 vibrant yellow bag.\n" +
            "posh tan bags contain 2 dull orange bags, 4 pale violet bags, 2 shiny brown bags.\n" +
            "light red bags contain 4 dim maroon bags, 4 faded salmon bags, 5 plaid purple bags.\n" +
            "dotted beige bags contain 2 shiny fuchsia bags, 3 faded cyan bags, 5 mirrored red bags, 3 drab turquoise bags.\n" +
            "drab purple bags contain 3 bright cyan bags, 1 faded bronze bag, 3 light plum bags, 1 dull fuchsia bag.\n" +
            "bright brown bags contain 2 dotted green bags, 4 clear tan bags, 3 wavy red bags.";
}
