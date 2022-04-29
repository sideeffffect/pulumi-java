// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTemplateRateIncreaseCriteriaArgs extends ResourceArgs {

    public static final JobTemplateRateIncreaseCriteriaArgs Empty = new JobTemplateRateIncreaseCriteriaArgs();

    @Import(name="numberOfNotifiedThings")
    private @Nullable Output<Integer> numberOfNotifiedThings;

    public Optional<Output<Integer>> numberOfNotifiedThings() {
        return Optional.ofNullable(this.numberOfNotifiedThings);
    }

    @Import(name="numberOfSucceededThings")
    private @Nullable Output<Integer> numberOfSucceededThings;

    public Optional<Output<Integer>> numberOfSucceededThings() {
        return Optional.ofNullable(this.numberOfSucceededThings);
    }

    private JobTemplateRateIncreaseCriteriaArgs() {}

    private JobTemplateRateIncreaseCriteriaArgs(JobTemplateRateIncreaseCriteriaArgs $) {
        this.numberOfNotifiedThings = $.numberOfNotifiedThings;
        this.numberOfSucceededThings = $.numberOfSucceededThings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTemplateRateIncreaseCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTemplateRateIncreaseCriteriaArgs $;

        public Builder() {
            $ = new JobTemplateRateIncreaseCriteriaArgs();
        }

        public Builder(JobTemplateRateIncreaseCriteriaArgs defaults) {
            $ = new JobTemplateRateIncreaseCriteriaArgs(Objects.requireNonNull(defaults));
        }

        public Builder numberOfNotifiedThings(@Nullable Output<Integer> numberOfNotifiedThings) {
            $.numberOfNotifiedThings = numberOfNotifiedThings;
            return this;
        }

        public Builder numberOfNotifiedThings(Integer numberOfNotifiedThings) {
            return numberOfNotifiedThings(Output.of(numberOfNotifiedThings));
        }

        public Builder numberOfSucceededThings(@Nullable Output<Integer> numberOfSucceededThings) {
            $.numberOfSucceededThings = numberOfSucceededThings;
            return this;
        }

        public Builder numberOfSucceededThings(Integer numberOfSucceededThings) {
            return numberOfSucceededThings(Output.of(numberOfSucceededThings));
        }

        public JobTemplateRateIncreaseCriteriaArgs build() {
            return $;
        }
    }

}
