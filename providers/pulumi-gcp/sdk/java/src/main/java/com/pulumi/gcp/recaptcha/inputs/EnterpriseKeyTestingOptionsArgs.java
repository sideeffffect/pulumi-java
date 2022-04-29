// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.recaptcha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnterpriseKeyTestingOptionsArgs extends ResourceArgs {

    public static final EnterpriseKeyTestingOptionsArgs Empty = new EnterpriseKeyTestingOptionsArgs();

    /**
     * For challenge-based keys only (CHECKBOX, INVISIBLE), all challenge requests for this site will return nocaptcha if NOCAPTCHA, or an unsolvable challenge if UNSOLVABLE_CHALLENGE. Possible values: TESTING_CHALLENGE_UNSPECIFIED, NOCAPTCHA, UNSOLVABLE_CHALLENGE
     * 
     */
    @Import(name="testingChallenge")
    private @Nullable Output<String> testingChallenge;

    /**
     * @return For challenge-based keys only (CHECKBOX, INVISIBLE), all challenge requests for this site will return nocaptcha if NOCAPTCHA, or an unsolvable challenge if UNSOLVABLE_CHALLENGE. Possible values: TESTING_CHALLENGE_UNSPECIFIED, NOCAPTCHA, UNSOLVABLE_CHALLENGE
     * 
     */
    public Optional<Output<String>> testingChallenge() {
        return Optional.ofNullable(this.testingChallenge);
    }

    /**
     * All assessments for this Key will return this score. Must be between 0 (likely not legitimate) and 1 (likely legitimate) inclusive.
     * 
     */
    @Import(name="testingScore")
    private @Nullable Output<Double> testingScore;

    /**
     * @return All assessments for this Key will return this score. Must be between 0 (likely not legitimate) and 1 (likely legitimate) inclusive.
     * 
     */
    public Optional<Output<Double>> testingScore() {
        return Optional.ofNullable(this.testingScore);
    }

    private EnterpriseKeyTestingOptionsArgs() {}

    private EnterpriseKeyTestingOptionsArgs(EnterpriseKeyTestingOptionsArgs $) {
        this.testingChallenge = $.testingChallenge;
        this.testingScore = $.testingScore;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnterpriseKeyTestingOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnterpriseKeyTestingOptionsArgs $;

        public Builder() {
            $ = new EnterpriseKeyTestingOptionsArgs();
        }

        public Builder(EnterpriseKeyTestingOptionsArgs defaults) {
            $ = new EnterpriseKeyTestingOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param testingChallenge For challenge-based keys only (CHECKBOX, INVISIBLE), all challenge requests for this site will return nocaptcha if NOCAPTCHA, or an unsolvable challenge if UNSOLVABLE_CHALLENGE. Possible values: TESTING_CHALLENGE_UNSPECIFIED, NOCAPTCHA, UNSOLVABLE_CHALLENGE
         * 
         * @return builder
         * 
         */
        public Builder testingChallenge(@Nullable Output<String> testingChallenge) {
            $.testingChallenge = testingChallenge;
            return this;
        }

        /**
         * @param testingChallenge For challenge-based keys only (CHECKBOX, INVISIBLE), all challenge requests for this site will return nocaptcha if NOCAPTCHA, or an unsolvable challenge if UNSOLVABLE_CHALLENGE. Possible values: TESTING_CHALLENGE_UNSPECIFIED, NOCAPTCHA, UNSOLVABLE_CHALLENGE
         * 
         * @return builder
         * 
         */
        public Builder testingChallenge(String testingChallenge) {
            return testingChallenge(Output.of(testingChallenge));
        }

        /**
         * @param testingScore All assessments for this Key will return this score. Must be between 0 (likely not legitimate) and 1 (likely legitimate) inclusive.
         * 
         * @return builder
         * 
         */
        public Builder testingScore(@Nullable Output<Double> testingScore) {
            $.testingScore = testingScore;
            return this;
        }

        /**
         * @param testingScore All assessments for this Key will return this score. Must be between 0 (likely not legitimate) and 1 (likely legitimate) inclusive.
         * 
         * @return builder
         * 
         */
        public Builder testingScore(Double testingScore) {
            return testingScore(Output.of(testingScore));
        }

        public EnterpriseKeyTestingOptionsArgs build() {
            return $;
        }
    }

}
