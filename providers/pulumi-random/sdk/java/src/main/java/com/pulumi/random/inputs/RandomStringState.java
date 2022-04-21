// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.random.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RandomStringState extends com.pulumi.resources.ResourceArgs {

    public static final RandomStringState Empty = new RandomStringState();

    /**
     * Arbitrary map of values that, when changed, will trigger recreation of resource. See the main provider documentation for more information.
     * 
     */
    @Import(name="keepers")
    private @Nullable Output<Map<String,Object>> keepers;

    public Optional<Output<Map<String,Object>>> keepers() {
        return Optional.ofNullable(this.keepers);
    }

    /**
     * The length of the string desired.
     * 
     */
    @Import(name="length")
    private @Nullable Output<Integer> length;

    public Optional<Output<Integer>> length() {
        return Optional.ofNullable(this.length);
    }

    /**
     * Include lowercase alphabet characters in the result.
     * 
     */
    @Import(name="lower")
    private @Nullable Output<Boolean> lower;

    public Optional<Output<Boolean>> lower() {
        return Optional.ofNullable(this.lower);
    }

    /**
     * Minimum number of lowercase alphabet characters in the result.
     * 
     */
    @Import(name="minLower")
    private @Nullable Output<Integer> minLower;

    public Optional<Output<Integer>> minLower() {
        return Optional.ofNullable(this.minLower);
    }

    /**
     * Minimum number of numeric characters in the result.
     * 
     */
    @Import(name="minNumeric")
    private @Nullable Output<Integer> minNumeric;

    public Optional<Output<Integer>> minNumeric() {
        return Optional.ofNullable(this.minNumeric);
    }

    /**
     * Minimum number of special characters in the result.
     * 
     */
    @Import(name="minSpecial")
    private @Nullable Output<Integer> minSpecial;

    public Optional<Output<Integer>> minSpecial() {
        return Optional.ofNullable(this.minSpecial);
    }

    /**
     * Minimum number of uppercase alphabet characters in the result.
     * 
     */
    @Import(name="minUpper")
    private @Nullable Output<Integer> minUpper;

    public Optional<Output<Integer>> minUpper() {
        return Optional.ofNullable(this.minUpper);
    }

    /**
     * Include numeric characters in the result.
     * 
     */
    @Import(name="number")
    private @Nullable Output<Boolean> number;

    public Optional<Output<Boolean>> number() {
        return Optional.ofNullable(this.number);
    }

    /**
     * Supply your own list of special characters to use for string generation.  This overrides the default character list in the special argument.  The `special` argument must still be set to true for any overwritten characters to be used in generation.
     * 
     */
    @Import(name="overrideSpecial")
    private @Nullable Output<String> overrideSpecial;

    public Optional<Output<String>> overrideSpecial() {
        return Optional.ofNullable(this.overrideSpecial);
    }

    /**
     * The generated random string.
     * 
     */
    @Import(name="result")
    private @Nullable Output<String> result;

    public Optional<Output<String>> result() {
        return Optional.ofNullable(this.result);
    }

    /**
     * Include special characters in the result. These are `!@#$%&amp;*()-_=+[]{}&lt;&gt;:?`
     * 
     */
    @Import(name="special")
    private @Nullable Output<Boolean> special;

    public Optional<Output<Boolean>> special() {
        return Optional.ofNullable(this.special);
    }

    /**
     * Include uppercase alphabet characters in the result.
     * 
     */
    @Import(name="upper")
    private @Nullable Output<Boolean> upper;

    public Optional<Output<Boolean>> upper() {
        return Optional.ofNullable(this.upper);
    }

    private RandomStringState() {}

    private RandomStringState(RandomStringState $) {
        this.keepers = $.keepers;
        this.length = $.length;
        this.lower = $.lower;
        this.minLower = $.minLower;
        this.minNumeric = $.minNumeric;
        this.minSpecial = $.minSpecial;
        this.minUpper = $.minUpper;
        this.number = $.number;
        this.overrideSpecial = $.overrideSpecial;
        this.result = $.result;
        this.special = $.special;
        this.upper = $.upper;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RandomStringState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RandomStringState $;

        public Builder() {
            $ = new RandomStringState();
        }

        public Builder(RandomStringState defaults) {
            $ = new RandomStringState(Objects.requireNonNull(defaults));
        }

        public Builder keepers(@Nullable Output<Map<String,Object>> keepers) {
            $.keepers = keepers;
            return this;
        }

        public Builder keepers(Map<String,Object> keepers) {
            return keepers(Output.of(keepers));
        }

        public Builder length(@Nullable Output<Integer> length) {
            $.length = length;
            return this;
        }

        public Builder length(Integer length) {
            return length(Output.of(length));
        }

        public Builder lower(@Nullable Output<Boolean> lower) {
            $.lower = lower;
            return this;
        }

        public Builder lower(Boolean lower) {
            return lower(Output.of(lower));
        }

        public Builder minLower(@Nullable Output<Integer> minLower) {
            $.minLower = minLower;
            return this;
        }

        public Builder minLower(Integer minLower) {
            return minLower(Output.of(minLower));
        }

        public Builder minNumeric(@Nullable Output<Integer> minNumeric) {
            $.minNumeric = minNumeric;
            return this;
        }

        public Builder minNumeric(Integer minNumeric) {
            return minNumeric(Output.of(minNumeric));
        }

        public Builder minSpecial(@Nullable Output<Integer> minSpecial) {
            $.minSpecial = minSpecial;
            return this;
        }

        public Builder minSpecial(Integer minSpecial) {
            return minSpecial(Output.of(minSpecial));
        }

        public Builder minUpper(@Nullable Output<Integer> minUpper) {
            $.minUpper = minUpper;
            return this;
        }

        public Builder minUpper(Integer minUpper) {
            return minUpper(Output.of(minUpper));
        }

        public Builder number(@Nullable Output<Boolean> number) {
            $.number = number;
            return this;
        }

        public Builder number(Boolean number) {
            return number(Output.of(number));
        }

        public Builder overrideSpecial(@Nullable Output<String> overrideSpecial) {
            $.overrideSpecial = overrideSpecial;
            return this;
        }

        public Builder overrideSpecial(String overrideSpecial) {
            return overrideSpecial(Output.of(overrideSpecial));
        }

        public Builder result(@Nullable Output<String> result) {
            $.result = result;
            return this;
        }

        public Builder result(String result) {
            return result(Output.of(result));
        }

        public Builder special(@Nullable Output<Boolean> special) {
            $.special = special;
            return this;
        }

        public Builder special(Boolean special) {
            return special(Output.of(special));
        }

        public Builder upper(@Nullable Output<Boolean> upper) {
            $.upper = upper;
            return this;
        }

        public Builder upper(Boolean upper) {
            return upper(Output.of(upper));
        }

        public RandomStringState build() {
            return $;
        }
    }

}
