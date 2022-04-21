// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobPlacementArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobPlacementArgs Empty = new JobPlacementArgs();

    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    public Output<String> clusterName() {
        return this.clusterName;
    }

    @Import(name="clusterUuid")
    private @Nullable Output<String> clusterUuid;

    public Optional<Output<String>> clusterUuid() {
        return Optional.ofNullable(this.clusterUuid);
    }

    private JobPlacementArgs() {}

    private JobPlacementArgs(JobPlacementArgs $) {
        this.clusterName = $.clusterName;
        this.clusterUuid = $.clusterUuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobPlacementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobPlacementArgs $;

        public Builder() {
            $ = new JobPlacementArgs();
        }

        public Builder(JobPlacementArgs defaults) {
            $ = new JobPlacementArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        public Builder clusterUuid(@Nullable Output<String> clusterUuid) {
            $.clusterUuid = clusterUuid;
            return this;
        }

        public Builder clusterUuid(String clusterUuid) {
            return clusterUuid(Output.of(clusterUuid));
        }

        public JobPlacementArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            return $;
        }
    }

}
