// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainEbsOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainEbsOptionsGetArgs Empty = new DomainEbsOptionsGetArgs();

    /**
     * Whether EBS volumes are attached to data nodes in the domain.
     * 
     */
    @Import(name="ebsEnabled", required=true)
      private final Output<Boolean> ebsEnabled;

    public Output<Boolean> ebsEnabled() {
        return this.ebsEnabled;
    }

    /**
     * Baseline input/output (I/O) performance of EBS volumes attached to data nodes. Applicable only for the Provisioned IOPS EBS volume type.
     * 
     */
    @Import(name="iops")
      private final @Nullable Output<Integer> iops;

    public Output<Integer> iops() {
        return this.iops == null ? Codegen.empty() : this.iops;
    }

    /**
     * Size of EBS volumes attached to data nodes (in GiB).
     * 
     */
    @Import(name="volumeSize")
      private final @Nullable Output<Integer> volumeSize;

    public Output<Integer> volumeSize() {
        return this.volumeSize == null ? Codegen.empty() : this.volumeSize;
    }

    /**
     * Type of EBS volumes attached to data nodes.
     * 
     */
    @Import(name="volumeType")
      private final @Nullable Output<String> volumeType;

    public Output<String> volumeType() {
        return this.volumeType == null ? Codegen.empty() : this.volumeType;
    }

    public DomainEbsOptionsGetArgs(
        Output<Boolean> ebsEnabled,
        @Nullable Output<Integer> iops,
        @Nullable Output<Integer> volumeSize,
        @Nullable Output<String> volumeType) {
        this.ebsEnabled = Objects.requireNonNull(ebsEnabled, "expected parameter 'ebsEnabled' to be non-null");
        this.iops = iops;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    private DomainEbsOptionsGetArgs() {
        this.ebsEnabled = Codegen.empty();
        this.iops = Codegen.empty();
        this.volumeSize = Codegen.empty();
        this.volumeType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainEbsOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> ebsEnabled;
        private @Nullable Output<Integer> iops;
        private @Nullable Output<Integer> volumeSize;
        private @Nullable Output<String> volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainEbsOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ebsEnabled = defaults.ebsEnabled;
    	      this.iops = defaults.iops;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder ebsEnabled(Output<Boolean> ebsEnabled) {
            this.ebsEnabled = Objects.requireNonNull(ebsEnabled);
            return this;
        }
        public Builder ebsEnabled(Boolean ebsEnabled) {
            this.ebsEnabled = Output.of(Objects.requireNonNull(ebsEnabled));
            return this;
        }
        public Builder iops(@Nullable Output<Integer> iops) {
            this.iops = iops;
            return this;
        }
        public Builder iops(@Nullable Integer iops) {
            this.iops = Codegen.ofNullable(iops);
            return this;
        }
        public Builder volumeSize(@Nullable Output<Integer> volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }
        public Builder volumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = Codegen.ofNullable(volumeSize);
            return this;
        }
        public Builder volumeType(@Nullable Output<String> volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public Builder volumeType(@Nullable String volumeType) {
            this.volumeType = Codegen.ofNullable(volumeType);
            return this;
        }        public DomainEbsOptionsGetArgs build() {
            return new DomainEbsOptionsGetArgs(ebsEnabled, iops, volumeSize, volumeType);
        }
    }
}
