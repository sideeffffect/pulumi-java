// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.pubsub.inputs.LiteTopicPartitionConfigArgs;
import io.pulumi.gcp.pubsub.inputs.LiteTopicReservationConfigArgs;
import io.pulumi.gcp.pubsub.inputs.LiteTopicRetentionConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LiteTopicArgs extends io.pulumi.resources.ResourceArgs {

    public static final LiteTopicArgs Empty = new LiteTopicArgs();

    /**
     * Name of the topic.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The settings for this topic's partitions.
     * Structure is documented below.
     * 
     */
    @Import(name="partitionConfig")
      private final @Nullable Output<LiteTopicPartitionConfigArgs> partitionConfig;

    public Output<LiteTopicPartitionConfigArgs> partitionConfig() {
        return this.partitionConfig == null ? Codegen.empty() : this.partitionConfig;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The region of the pubsub lite topic.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> region() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    /**
     * The settings for this topic's Reservation usage.
     * Structure is documented below.
     * 
     */
    @Import(name="reservationConfig")
      private final @Nullable Output<LiteTopicReservationConfigArgs> reservationConfig;

    public Output<LiteTopicReservationConfigArgs> reservationConfig() {
        return this.reservationConfig == null ? Codegen.empty() : this.reservationConfig;
    }

    /**
     * The settings for a topic's message retention.
     * Structure is documented below.
     * 
     */
    @Import(name="retentionConfig")
      private final @Nullable Output<LiteTopicRetentionConfigArgs> retentionConfig;

    public Output<LiteTopicRetentionConfigArgs> retentionConfig() {
        return this.retentionConfig == null ? Codegen.empty() : this.retentionConfig;
    }

    /**
     * The zone of the pubsub lite topic.
     * 
     */
    @Import(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> zone() {
        return this.zone == null ? Codegen.empty() : this.zone;
    }

    public LiteTopicArgs(
        @Nullable Output<String> name,
        @Nullable Output<LiteTopicPartitionConfigArgs> partitionConfig,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        @Nullable Output<LiteTopicReservationConfigArgs> reservationConfig,
        @Nullable Output<LiteTopicRetentionConfigArgs> retentionConfig,
        @Nullable Output<String> zone) {
        this.name = name;
        this.partitionConfig = partitionConfig;
        this.project = project;
        this.region = region;
        this.reservationConfig = reservationConfig;
        this.retentionConfig = retentionConfig;
        this.zone = zone;
    }

    private LiteTopicArgs() {
        this.name = Codegen.empty();
        this.partitionConfig = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.reservationConfig = Codegen.empty();
        this.retentionConfig = Codegen.empty();
        this.zone = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiteTopicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<LiteTopicPartitionConfigArgs> partitionConfig;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private @Nullable Output<LiteTopicReservationConfigArgs> reservationConfig;
        private @Nullable Output<LiteTopicRetentionConfigArgs> retentionConfig;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(LiteTopicArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.partitionConfig = defaults.partitionConfig;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.reservationConfig = defaults.reservationConfig;
    	      this.retentionConfig = defaults.retentionConfig;
    	      this.zone = defaults.zone;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder partitionConfig(@Nullable Output<LiteTopicPartitionConfigArgs> partitionConfig) {
            this.partitionConfig = partitionConfig;
            return this;
        }
        public Builder partitionConfig(@Nullable LiteTopicPartitionConfigArgs partitionConfig) {
            this.partitionConfig = Codegen.ofNullable(partitionConfig);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }
        public Builder reservationConfig(@Nullable Output<LiteTopicReservationConfigArgs> reservationConfig) {
            this.reservationConfig = reservationConfig;
            return this;
        }
        public Builder reservationConfig(@Nullable LiteTopicReservationConfigArgs reservationConfig) {
            this.reservationConfig = Codegen.ofNullable(reservationConfig);
            return this;
        }
        public Builder retentionConfig(@Nullable Output<LiteTopicRetentionConfigArgs> retentionConfig) {
            this.retentionConfig = retentionConfig;
            return this;
        }
        public Builder retentionConfig(@Nullable LiteTopicRetentionConfigArgs retentionConfig) {
            this.retentionConfig = Codegen.ofNullable(retentionConfig);
            return this;
        }
        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }
        public Builder zone(@Nullable String zone) {
            this.zone = Codegen.ofNullable(zone);
            return this;
        }        public LiteTopicArgs build() {
            return new LiteTopicArgs(name, partitionConfig, project, region, reservationConfig, retentionConfig, zone);
        }
    }
}
