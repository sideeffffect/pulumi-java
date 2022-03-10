// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.pubsub.inputs.LiteTopicPartitionConfigGetArgs;
import io.pulumi.gcp.pubsub.inputs.LiteTopicReservationConfigGetArgs;
import io.pulumi.gcp.pubsub.inputs.LiteTopicRetentionConfigGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LiteTopicState extends io.pulumi.resources.ResourceArgs {

    public static final LiteTopicState Empty = new LiteTopicState();

    /**
     * Name of the topic.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The settings for this topic's partitions.
     * Structure is documented below.
     * 
     */
    @InputImport(name="partitionConfig")
      private final @Nullable Input<LiteTopicPartitionConfigGetArgs> partitionConfig;

    public Input<LiteTopicPartitionConfigGetArgs> getPartitionConfig() {
        return this.partitionConfig == null ? Input.empty() : this.partitionConfig;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The region of the pubsub lite topic.
     * 
     */
    @InputImport(name="region")
      private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * The settings for this topic's Reservation usage.
     * Structure is documented below.
     * 
     */
    @InputImport(name="reservationConfig")
      private final @Nullable Input<LiteTopicReservationConfigGetArgs> reservationConfig;

    public Input<LiteTopicReservationConfigGetArgs> getReservationConfig() {
        return this.reservationConfig == null ? Input.empty() : this.reservationConfig;
    }

    /**
     * The settings for a topic's message retention.
     * Structure is documented below.
     * 
     */
    @InputImport(name="retentionConfig")
      private final @Nullable Input<LiteTopicRetentionConfigGetArgs> retentionConfig;

    public Input<LiteTopicRetentionConfigGetArgs> getRetentionConfig() {
        return this.retentionConfig == null ? Input.empty() : this.retentionConfig;
    }

    /**
     * The zone of the pubsub lite topic.
     * 
     */
    @InputImport(name="zone")
      private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public LiteTopicState(
        @Nullable Input<String> name,
        @Nullable Input<LiteTopicPartitionConfigGetArgs> partitionConfig,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        @Nullable Input<LiteTopicReservationConfigGetArgs> reservationConfig,
        @Nullable Input<LiteTopicRetentionConfigGetArgs> retentionConfig,
        @Nullable Input<String> zone) {
        this.name = name;
        this.partitionConfig = partitionConfig;
        this.project = project;
        this.region = region;
        this.reservationConfig = reservationConfig;
        this.retentionConfig = retentionConfig;
        this.zone = zone;
    }

    private LiteTopicState() {
        this.name = Input.empty();
        this.partitionConfig = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.reservationConfig = Input.empty();
        this.retentionConfig = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiteTopicState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<LiteTopicPartitionConfigGetArgs> partitionConfig;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private @Nullable Input<LiteTopicReservationConfigGetArgs> reservationConfig;
        private @Nullable Input<LiteTopicRetentionConfigGetArgs> retentionConfig;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(LiteTopicState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.partitionConfig = defaults.partitionConfig;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.reservationConfig = defaults.reservationConfig;
    	      this.retentionConfig = defaults.retentionConfig;
    	      this.zone = defaults.zone;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder partitionConfig(@Nullable Input<LiteTopicPartitionConfigGetArgs> partitionConfig) {
            this.partitionConfig = partitionConfig;
            return this;
        }

        public Builder partitionConfig(@Nullable LiteTopicPartitionConfigGetArgs partitionConfig) {
            this.partitionConfig = Input.ofNullable(partitionConfig);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder region(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder reservationConfig(@Nullable Input<LiteTopicReservationConfigGetArgs> reservationConfig) {
            this.reservationConfig = reservationConfig;
            return this;
        }

        public Builder reservationConfig(@Nullable LiteTopicReservationConfigGetArgs reservationConfig) {
            this.reservationConfig = Input.ofNullable(reservationConfig);
            return this;
        }

        public Builder retentionConfig(@Nullable Input<LiteTopicRetentionConfigGetArgs> retentionConfig) {
            this.retentionConfig = retentionConfig;
            return this;
        }

        public Builder retentionConfig(@Nullable LiteTopicRetentionConfigGetArgs retentionConfig) {
            this.retentionConfig = Input.ofNullable(retentionConfig);
            return this;
        }

        public Builder zone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder zone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }
        public LiteTopicState build() {
            return new LiteTopicState(name, partitionConfig, project, region, reservationConfig, retentionConfig, zone);
        }
    }
}
