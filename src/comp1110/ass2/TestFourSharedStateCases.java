package comp1110.ass2;

public interface TestFourSharedStateCases extends TestFourStateCases{
    /**
     * Valid States Factories and Factory
     * Include 10 columns : Factories, Factory 0, Factory 1, ... ,Factory 8
     */
    public static final String[][] FULL_FOUR_PLAYER_GAME_STATES_FACTORIES = {
            new String[]{"0acee1adde2acde3bbee4abdd5abde6abbc7abbd8adde", "acee", "adde", "acde", "bbee", "abdd", "abde", "abbc", "abbd", "adde"},
            new String[]{"0acee1adde3bbee4abdd5abde6abbc7abbd8adde", "acee", "adde", "", "bbee", "abdd", "abde", "abbc", "abbd", "adde"},
            new String[]{"0acee3bbee4abdd5abde6abbc7abbd8adde", "acee", "", "", "bbee", "abdd", "abde", "abbc", "abbd", "adde"},
            new String[]{"0acee3bbee4abdd5abde6abbc7abbd", "acee", "", "", "bbee", "abdd", "abde", "abbc", "abbd", ""},
            new String[]{"0acee4abdd5abde6abbc7abbd", "acee", "", "", "", "abdd", "abde", "abbc", "abbd", ""},
            new String[]{"0acee5abde6abbc7abbd", "acee", "", "", "", "", "abde", "abbc", "abbd", ""},
            new String[]{"0acee5abde6abbc", "acee", "", "", "", "", "abde", "abbc", "", ""},
            new String[]{"5abde6abbc", "", "", "", "", "", "abde", "abbc", "", ""},
            new String[]{"6abbc", "", "", "", "", "", "", "abbc", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"0aace1bcde2aabe3abbb4bccc5aade6cccd7abbc8cddd", "aace", "bcde", "aabe", "abbb", "bccc", "aade", "cccd", "abbc", "cddd"},
            new String[]{"1bcde2aabe3abbb4bccc5aade6cccd7abbc8cddd", "", "bcde", "aabe", "abbb", "bccc", "aade", "cccd", "abbc", "cddd"},
            new String[]{"1bcde2aabe3abbb4bccc5aade6cccd7abbc8cddd", "", "bcde", "aabe", "abbb", "bccc", "aade", "cccd", "abbc", "cddd"},
            new String[]{"1bcde2aabe3abbb4bccc6cccd7abbc8cddd", "", "bcde", "aabe", "abbb", "bccc", "", "cccd", "abbc", "cddd"},
            new String[]{"1bcde2aabe4bccc6cccd7abbc8cddd", "", "bcde", "aabe", "", "bccc", "", "cccd", "abbc", "cddd"},
            new String[]{"1bcde2aabe4bccc6cccd7abbc8cddd", "", "bcde", "aabe", "", "bccc", "", "cccd", "abbc", "cddd"},
            new String[]{"1bcde2aabe4bccc6cccd7abbc", "", "bcde", "aabe", "", "bccc", "", "cccd", "abbc", ""},
            new String[]{"2aabe4bccc6cccd7abbc", "", "", "aabe", "", "bccc", "", "cccd", "abbc", ""},
            new String[]{"2aabe4bccc6cccd", "", "", "aabe", "", "bccc", "", "cccd", "", ""},
            new String[]{"2aabe6cccd", "", "", "aabe", "", "", "", "cccd", "", ""},
            new String[]{"6cccd", "", "", "", "", "", "", "cccd", "", ""},
            new String[]{"6cccd", "", "", "", "", "", "", "cccd", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"0ceee1abcd2bcce3bdde4abde5adee6accc7abce8accd", "ceee", "abcd", "bcce", "bdde", "abde", "adee", "accc", "abce", "accd"},
            new String[]{"0ceee2bcce3bdde4abde5adee6accc7abce8accd", "ceee", "", "bcce", "bdde", "abde", "adee", "accc", "abce", "accd"},
            new String[]{"0ceee2bcce3bdde4abde5adee7abce8accd", "ceee", "", "bcce", "bdde", "abde", "adee", "", "abce", "accd"},
            new String[]{"2bcce3bdde4abde5adee7abce8accd", "", "", "bcce", "bdde", "abde", "adee", "", "abce", "accd"},
            new String[]{"2bcce3bdde5adee7abce8accd", "", "", "bcce", "bdde", "", "adee", "", "abce", "accd"},
            new String[]{"2bcce3bdde7abce8accd", "", "", "bcce", "bdde", "", "", "", "abce", "accd"},
            new String[]{"2bcce7abce8accd", "", "", "bcce", "", "", "", "", "abce", "accd"},
            new String[]{"2bcce8accd", "", "", "bcce", "", "", "", "", "", "accd"},
            new String[]{"8accd", "", "", "", "", "", "", "", "", "accd"},
            new String[]{"8accd", "", "", "", "", "", "", "", "", "accd"},
            new String[]{"8accd", "", "", "", "", "", "", "", "", "accd"},
            new String[]{"8accd", "", "", "", "", "", "", "", "", "accd"},
            new String[]{"8accd", "", "", "", "", "", "", "", "", "accd"},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"0abde1bcde2aadd3acde4abbd5bbcd6acdd7abbe8bbcd", "abde", "bcde", "aadd", "acde", "abbd", "bbcd", "acdd", "abbe", "bbcd"},
            new String[]{"0abde1bcde2aadd4abbd5bbcd6acdd7abbe8bbcd", "abde", "bcde", "aadd", "", "abbd", "bbcd", "acdd", "abbe", "bbcd"},
            new String[]{"0abde1bcde2aadd4abbd5bbcd6acdd7abbe8bbcd", "abde", "bcde", "aadd", "", "abbd", "bbcd", "acdd", "abbe", "bbcd"},
            new String[]{"0abde1bcde4abbd5bbcd6acdd7abbe8bbcd", "abde", "bcde", "", "", "abbd", "bbcd", "acdd", "abbe", "bbcd"},
            new String[]{"0abde1bcde4abbd5bbcd7abbe8bbcd", "abde", "bcde", "", "", "abbd", "bbcd", "", "abbe", "bbcd"},
            new String[]{"0abde4abbd5bbcd7abbe8bbcd", "abde", "", "", "", "abbd", "bbcd", "", "abbe", "bbcd"},
            new String[]{"0abde4abbd5bbcd7abbe8bbcd", "abde", "", "", "", "abbd", "bbcd", "", "abbe", "bbcd"},
            new String[]{"0abde4abbd5bbcd7abbe", "abde", "", "", "", "abbd", "bbcd", "", "abbe", ""},
            new String[]{"0abde4abbd7abbe", "abde", "", "", "", "abbd", "", "", "abbe", ""},
            new String[]{"4abbd7abbe", "", "", "", "", "abbd", "", "", "abbe", ""},
            new String[]{"7abbe", "", "", "", "", "", "", "", "abbe", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"0aabc1abcd2aacd3bbce4abcd5bccd6bdde7acee8accd", "aabc", "abcd", "aacd", "bbce", "abcd", "bccd", "bdde", "acee", "accd"},
            new String[]{"1abcd2aacd3bbce4abcd5bccd6bdde7acee8accd", "", "abcd", "aacd", "bbce", "abcd", "bccd", "bdde", "acee", "accd"},
            new String[]{"1abcd2aacd3bbce5bccd6bdde7acee8accd", "", "abcd", "aacd", "bbce", "", "bccd", "bdde", "acee", "accd"},
            new String[]{"2aacd3bbce5bccd6bdde7acee8accd", "", "", "aacd", "bbce", "", "bccd", "bdde", "acee", "accd"},
            new String[]{"2aacd3bbce5bccd6bdde7acee", "", "", "aacd", "bbce", "", "bccd", "bdde", "acee", ""},
            new String[]{"2aacd3bbce5bccd6bdde", "", "", "aacd", "bbce", "", "bccd", "bdde", "", ""},
            new String[]{"3bbce5bccd6bdde", "", "", "", "bbce", "", "bccd", "bdde", "", ""},
            new String[]{"3bbce5bccd", "", "", "", "bbce", "", "bccd", "", "", ""},
            new String[]{"3bbce5bccd", "", "", "", "bbce", "", "bccd", "", "", ""},
            new String[]{"3bbce", "", "", "", "bbce", "", "", "", "", ""},
            new String[]{"3bbce", "", "", "", "bbce", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"0aabd1abbc2bbcd3abce4bbcd5adee6abcd7bbcd8aabb", "aabd", "abbc", "bbcd", "abce", "bbcd", "adee", "abcd", "bbcd", "aabb"},
            new String[]{"0aabd1abbc2bbcd3abce5adee6abcd7bbcd8aabb", "aabd", "abbc", "bbcd", "abce", "", "adee", "abcd", "bbcd", "aabb"},
            new String[]{"0aabd1abbc2bbcd5adee6abcd7bbcd8aabb", "aabd", "abbc", "bbcd", "", "", "adee", "abcd", "bbcd", "aabb"},
            new String[]{"1abbc2bbcd5adee6abcd7bbcd8aabb", "", "abbc", "bbcd", "", "", "adee", "abcd", "bbcd", "aabb"},
            new String[]{"1abbc2bbcd5adee6abcd7bbcd8aabb", "", "abbc", "bbcd", "", "", "adee", "abcd", "bbcd", "aabb"},
            new String[]{"1abbc5adee6abcd7bbcd8aabb", "", "abbc", "", "", "", "adee", "abcd", "bbcd", "aabb"},
            new String[]{"1abbc6abcd7bbcd8aabb", "", "abbc", "", "", "", "", "abcd", "bbcd", "aabb"},
            new String[]{"1abbc7bbcd8aabb", "", "abbc", "", "", "", "", "", "bbcd", "aabb"},
            new String[]{"1abbc7bbcd8aabb", "", "abbc", "", "", "", "", "", "bbcd", "aabb"},
            new String[]{"1abbc8aabb", "", "abbc", "", "", "", "", "", "", "aabb"},
            new String[]{"8aabb", "", "", "", "", "", "", "", "", "aabb"},
            new String[]{"8aabb", "", "", "", "", "", "", "", "", "aabb"},
            new String[]{"8aabb", "", "", "", "", "", "", "", "", "aabb"},
            new String[]{"8aabb", "", "", "", "", "", "", "", "", "aabb"},
            new String[]{"8aabb", "", "", "", "", "", "", "", "", "aabb"},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"0acde1accd2accd3abbc4bcde5bcce6aabd7abbd8bcce", "acde", "accd", "accd", "abbc", "bcde", "bcce", "aabd", "abbd", "bcce"},
            new String[]{"0acde1accd2accd3abbc4bcde5bcce6aabd8bcce", "acde", "accd", "accd", "abbc", "bcde", "bcce", "aabd", "", "bcce"},
            new String[]{"0acde1accd2accd3abbc4bcde5bcce6aabd8bcce", "acde", "accd", "accd", "abbc", "bcde", "bcce", "aabd", "", "bcce"},
            new String[]{"0acde1accd2accd3abbc4bcde5bcce8bcce", "acde", "accd", "accd", "abbc", "bcde", "bcce", "", "", "bcce"},
            new String[]{"0acde1accd2accd3abbc4bcde8bcce", "acde", "accd", "accd", "abbc", "bcde", "", "", "", "bcce"},
            new String[]{"0acde1accd2accd3abbc4bcde8bcce", "acde", "accd", "accd", "abbc", "bcde", "", "", "", "bcce"},
            new String[]{"1accd2accd3abbc4bcde8bcce", "", "accd", "accd", "abbc", "bcde", "", "", "", "bcce"},
            new String[]{"1accd2accd4bcde8bcce", "", "accd", "accd", "", "bcde", "", "", "", "bcce"},
            new String[]{"1accd2accd8bcce", "", "accd", "accd", "", "", "", "", "", "bcce"},
            new String[]{"1accd2accd8bcce", "", "accd", "accd", "", "", "", "", "", "bcce"},
            new String[]{"2accd8bcce", "", "", "accd", "", "", "", "", "", "bcce"},
            new String[]{"2accd8bcce", "", "", "accd", "", "", "", "", "", "bcce"},
            new String[]{"2accd", "", "", "accd", "", "", "", "", "", ""},
            new String[]{"2accd", "", "", "accd", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"0bbde1abbd2acdd3acdd4abcc5bbcd6acdd7abbc8abcc", "bbde", "abbd", "acdd", "acdd", "abcc", "bbcd", "acdd", "abbc", "abcc"},
            new String[]{"0bbde1abbd2acdd3acdd4abcc5bbcd6acdd7abbc", "bbde", "abbd", "acdd", "acdd", "abcc", "bbcd", "acdd", "abbc", ""},
            new String[]{"0bbde1abbd2acdd3acdd5bbcd6acdd7abbc", "bbde", "abbd", "acdd", "acdd", "", "bbcd", "acdd", "abbc", ""},
            new String[]{"0bbde1abbd2acdd3acdd5bbcd7abbc", "bbde", "abbd", "acdd", "acdd", "", "bbcd", "", "abbc", ""},
            new String[]{"0bbde1abbd2acdd3acdd5bbcd7abbc", "bbde", "abbd", "acdd", "acdd", "", "bbcd", "", "abbc", ""},
            new String[]{"0bbde1abbd2acdd5bbcd7abbc", "bbde", "abbd", "acdd", "", "", "bbcd", "", "abbc", ""},
            new String[]{"0bbde1abbd2acdd5bbcd", "bbde", "abbd", "acdd", "", "", "bbcd", "", "", ""},
            new String[]{"0bbde2acdd5bbcd", "bbde", "", "acdd", "", "", "bbcd", "", "", ""},
            new String[]{"0bbde2acdd", "bbde", "", "acdd", "", "", "", "", "", ""},
            new String[]{"0bbde2acdd", "bbde", "", "acdd", "", "", "", "", "", ""},
            new String[]{"2acdd", "", "", "acdd", "", "", "", "", "", ""},
            new String[]{"2acdd", "", "", "acdd", "", "", "", "", "", ""},
            new String[]{"2acdd", "", "", "acdd", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""},
            new String[]{"", "", "", "", "", "", "", "", "", ""}
    };

    /**
     * Valid States Center
     * Include : Center
     */
    public static final String[] FULL_FOUR_PLAYER_GAME_STATES_CENTER = {
            "f",
            "cdef",
            "acdddef",
            "aacdddddef",
            "aabbcdddddef",
            "aabbbcdddddddef",
            "aaabbbbbcdddddddef",
            "aaabbbbbccdddddddeeef",
            "aaabbbbbbccddddddddeeeef",
            "aaabbbbbbbbcccddddddddeeeef",
            "aaabbbbbbbbcccdddddddd",
            "bbbbbbbbcccdddddddd",
            "bbbbbbbbccc",
            "ccc",
            "",
            "",
            "",
            "",
            "f",
            "aaef",
            "e",
            "aade",
            "aaade",
            "aaae",
            "aaaddde",
            "aaabddddee",
            "aaaabbbddddee",
            "aaaabbbcccddddee",
            "aaaaaabbbbcccddddee",
            "aaaaaabbbbcccee",
            "aaaaaabbbbccccccee",
            "aaaaaabbbbee",
            "bbbbee",
            "ee",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "f",
            "bcdf",
            "bccccdf",
            "bcccccdf",
            "bbcccccddef",
            "abbcccccddeeef",
            "abbbcccccddeeeef",
            "abbbbccccccddeeeeef",
            "abbbbccccccccddeeeeeef",
            "abbbbcccccccceeeeee",
            "abbbbeeeeee",
            "abbbb",
            "bbbb",
            "bbbbccd",
            "bbbbd",
            "bbbb",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "f",
            "acdf",
            "ac",
            "aaac",
            "aaaacc",
            "aaaacccde",
            "aaaade",
            "aaaabbcde",
            "aaaabbccdde",
            "aaaaabbccdddee",
            "aaaaaabbccddddee",
            "aaaaaabbbbccddddeee",
            "bbbbccddddeee",
            "bbbbccdddd",
            "ccdddd",
            "cc",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "f",
            "aabf",
            "aaabcdf",
            "aaabbccddf",
            "aaaabbccdddf",
            "aaaaabbcccdddf",
            "aaaaaaabbccccdddf",
            "aaaaaaabbccccdddddef",
            "bbccccddddde",
            "bbbccccdddddde",
            "bbbdddddde",
            "bbbbbcdddddde",
            "bbbbbcdddddd",
            "cdddddd",
            "c",
            "",
            "",
            "",
            "",
            "",
            "f",
            "cdf",
            "bccdef",
            "aabccddef",
            "aabdde",
            "aabbbcdde",
            "aabbbcdddeee",
            "aaabbbccddddeee",
            "bbbccddddeee",
            "bbbbbccdddddeee",
            "bbbbbbbcccdddddeee",
            "bbbbbbbdddddeee",
            "dddddeee",
            "ddddd",
            "",
            "bb",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "f",
            "bbdf",
            "d",
            "bdd",
            "bbdde",
            "bbdd",
            "abbcddd",
            "aabbbbcddd",
            "aabbbbbcdddde",
            "aacdddde",
            "aacccddddde",
            "cccddddde",
            "bcccdddddee",
            "bcccee",
            "abcccdee",
            "abdee",
            "abee",
            "ab",
            "a",
            "",
            "",
            "",
            "",
            "",
            "f",
            "abf",
            "abbccf",
            "aabbcccf",
            "aaccc",
            "aaacccdd",
            "aaaaccccdd",
            "aaaaaccccddd",
            "aaaaabbcccccddd",
            "aaaaacccccddd",
            "aaaaabbcccccdddd",
            "aaaaabbdddd",
            "bbdddd",
            "abbcdddd",
            "abbdddd",
            "bbdddd",
            "dddd",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "f"
    };

    /**
     * Valid States Bag
     * Include : Bag
     */
    public static final String[] FULL_FOUR_PLAYER_GAME_STATES_BAG = {
            "1212171112",
            "1212171112",
            "1212171112",
            "1212171112",
            "1212171112",
            "1212171112",
            "1212171112",
            "1212171112",
            "1212171112",
            "1212171112",
            "1212171112",
            "1212171112",
            "1212171112",
            "1212171112",
            "1212171112",
            "1212171112",
            "1212171112",
            "1212171112",
            "0404070508",
            "0404070508",
            "0404070508",
            "0404070508",
            "0404070508",
            "0404070508",
            "0404070508",
            "0404070508",
            "0404070508",
            "0404070508",
            "0404070508",
            "0404070508",
            "0404070508",
            "0404070508",
            "0404070508",
            "0404070508",
            "0404070508",
            "0404070508",
            "0404070508",
            "0404070508",
            "0404070508",
            "0404070508",
            "0404070508",
            "0910061004",
            "0910061004",
            "0910061004",
            "0910061004",
            "0910061004",
            "0910061004",
            "0910061004",
            "0910061004",
            "0910061004",
            "0910061004",
            "0910061004",
            "0910061004",
            "0910061004",
            "0910061004",
            "0910061004",
            "0910061004",
            "0910061004",
            "0910061004",
            "0910061004",
            "0910061004",
            "0910061004",
            "0910061004",
            "0910061004",
            "0910061004",
            "0910061004",
            "0910061004",
            "0200010000",
            "0200010000",
            "0200010000",
            "0200010000",
            "0200010000",
            "0200010000",
            "0200010000",
            "0200010000",
            "0200010000",
            "0200010000",
            "0200010000",
            "0200010000",
            "0200010000",
            "0200010000",
            "0200010000",
            "0200010000",
            "0200010000",
            "0200010000",
            "0200010000",
            "0200010000",
            "0200010000",
            "0200010000",
            "0200010000",
            "0200010000",
            "0200010000",
            "0200010000",
            "0508050403",
            "0508050403",
            "0508050403",
            "0508050403",
            "0508050403",
            "0508050403",
            "0508050403",
            "0508050403",
            "0508050403",
            "0508050403",
            "0508050403",
            "0508050403",
            "0508050403",
            "0508050403",
            "0508050403",
            "0508050403",
            "0508050403",
            "0508050403",
            "0508050403",
            "0508050403",
            "0402070402",
            "0402070402",
            "0402070402",
            "0402070402",
            "0402070402",
            "0402070402",
            "0402070402",
            "0402070402",
            "0402070402",
            "0402070402",
            "0402070402",
            "0402070402",
            "0402070402",
            "0402070402",
            "0402070402",
            "0402070402",
            "0402070402",
            "0402070402",
            "0402070402",
            "0402070402",
            "0402070402",
            "0402070402",
            "0402070402",
            "0402070402",
            "0402070402",
            "0204010401",
            "0204010401",
            "0204010401",
            "0204010401",
            "0204010401",
            "0204010401",
            "0204010401",
            "0204010401",
            "0204010401",
            "0204010401",
            "0204010401",
            "0204010401",
            "0204010401",
            "0204010401",
            "0204010401",
            "0204010401",
            "0204010401",
            "0204010401",
            "0204010401",
            "0204010401",
            "0204010401",
            "0204010401",
            "0204010401",
            "0204010401",
            "0002020100",
            "0002020100",
            "0002020100",
            "0002020100",
            "0002020100",
            "0002020100",
            "0002020100",
            "0002020100",
            "0002020100",
            "0002020100",
            "0002020100",
            "0002020100",
            "0002020100",
            "0002020100",
            "0002020100",
            "0002020100",
            "0002020100",
            "0002020100",
            "0002020100",
            "0002020100",
            "0002020100",
            "0002020100",
            "0002020100",
            "0002020100",
            "0002020100"
    };

    /**
     * Valid States Discard
     * Include : Discard
     */
    public static final String[] FULL_FOUR_PLAYER_GAME_STATES_DISCARD = {
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0003000000",
            "0003000001",
            "0003000001",
            "0003000001",
            "0003000001",
            "0308030704",
            "0308030704",
            "0308030704",
            "0308030704",
            "0308030704",
            "0308030704",
            "0308030704",
            "0308030704",
            "0308030704",
            "0308030704",
            "0308030704",
            "0308030704",
            "0308030704",
            "0308030704",
            "0508030704",
            "0508030704",
            "0508030704",
            "0508030704",
            "0508030704",
            "0508030704",
            "0508030704",
            "0509030704",
            "0509030904",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000020000",
            "0000020000",
            "0000020000",
            "0003020000",
            "0003020000",
            "0003020100",
            "0003020100",
            "0003020200",
            "0303020200",
            "0303020200",
            "0303020201",
            "0303020203",
            "0607090407",
            "0607090407",
            "0607090407",
            "0607090407",
            "0607090407",
            "0607090407",
            "0607090407",
            "0607090407",
            "0607090407",
            "0607090407",
            "0607090407",
            "0607090407",
            "0607090407",
            "0607090407",
            "0607090407",
            "0607090407",
            "0607090407",
            "0607090407",
            "0607100407",
            "0907100407",
            "0909100407",
            "0909100407",
            "0910100407",
            "0910120407",
            "0913120407",
            "0913120507",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0100010000",
            "0100010000",
            "0100010000",
            "0100010000",
            "0100010000",
            "0100010001",
            "0100010201",
            "0100010201",
            "0100010201",
            "0100010201",
            "0100010202",
            "0100010402",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0001020000",
            "0001020000",
            "0001020000",
            "0001020000",
            "0002020000",
            "0002020000",
            "0302020000",
            "0302020000",
            "0302020000",
            "0402020000",
            "0402020300",
            "0402020300",
            "0402030300",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000300",
            "0000000300",
            "0000000300",
            "0000000300",
            "0000000300",
            "0000000300",
            "0000000300",
            "0300000300",
            "0300030300",
            "0400030300",
            "0400030300",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000000",
            "0000000100",
            "0000000100",
            "0000000100",
            "0000000100",
            "0000000200",
            "0000000200",
            "0000000200",
            "0000000200",
            "0000000500",
            "0000000500",
            "0000000500",
            "0000000500",
            "0001000500",
            "0605080801"
    };
}