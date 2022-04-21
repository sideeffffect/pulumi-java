// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.inputs;

import com.pulumi.awsnative.databrew.enums.JobSampleMode;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Job Sample
 * 
 */
public final class JobSampleArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobSampleArgs Empty = new JobSampleArgs();

    @Import(name="mode")
    private @Nullable Output<JobSampleMode> mode;

    public Optional<Output<JobSampleMode>> mode() {
        return Optional.ofNullable(this.mode);
    }

    @Import(name="size")
    private @Nullable Output<Integer> size;

    public Optional<Output<Integer>> size() {
        return Optional.ofNullable(this.size);
    }

    private JobSampleArgs() {}

    private JobSampleArgs(JobSampleArgs $) {
        this.mode = $.mode;
        this.size = $.size;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobSampleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobSampleArgs $;

        public Builder() {
            $ = new JobSampleArgs();
        }

        public Builder(JobSampleArgs defaults) {
            $ = new JobSampleArgs(Objects.requireNonNull(defaults));
        }

        public Builder mode(@Nullable Output<JobSampleMode> mode) {
            $.mode = mode;
            return this;
        }

        public Builder mode(JobSampleMode mode) {
            return mode(Output.of(mode));
        }

        public Builder size(@Nullable Output<Integer> size) {
            $.size = size;
            return this;
        }

        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        public JobSampleArgs build() {
            return $;
        }
    }

}
