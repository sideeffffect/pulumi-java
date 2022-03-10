// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.BucketReplicationRuleStatus;
import io.pulumi.awsnative.s3.inputs.BucketDeleteMarkerReplicationArgs;
import io.pulumi.awsnative.s3.inputs.BucketReplicationDestinationArgs;
import io.pulumi.awsnative.s3.inputs.BucketReplicationRuleFilterArgs;
import io.pulumi.awsnative.s3.inputs.BucketSourceSelectionCriteriaArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies which Amazon S3 objects to replicate and where to store the replicas.
 * 
 */
public final class BucketReplicationRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationRuleArgs Empty = new BucketReplicationRuleArgs();

    @InputImport(name="deleteMarkerReplication")
      private final @Nullable Input<BucketDeleteMarkerReplicationArgs> deleteMarkerReplication;

    public Input<BucketDeleteMarkerReplicationArgs> getDeleteMarkerReplication() {
        return this.deleteMarkerReplication == null ? Input.empty() : this.deleteMarkerReplication;
    }

    @InputImport(name="destination", required=true)
      private final Input<BucketReplicationDestinationArgs> destination;

    public Input<BucketReplicationDestinationArgs> getDestination() {
        return this.destination;
    }

    @InputImport(name="filter")
      private final @Nullable Input<BucketReplicationRuleFilterArgs> filter;

    public Input<BucketReplicationRuleFilterArgs> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    /**
     * A unique identifier for the rule.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * An object key name prefix that identifies the object or objects to which the rule applies.
     * 
     */
    @InputImport(name="prefix")
      private final @Nullable Input<String> prefix;

    public Input<String> getPrefix() {
        return this.prefix == null ? Input.empty() : this.prefix;
    }

    @InputImport(name="priority")
      private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    @InputImport(name="sourceSelectionCriteria")
      private final @Nullable Input<BucketSourceSelectionCriteriaArgs> sourceSelectionCriteria;

    public Input<BucketSourceSelectionCriteriaArgs> getSourceSelectionCriteria() {
        return this.sourceSelectionCriteria == null ? Input.empty() : this.sourceSelectionCriteria;
    }

    /**
     * Specifies whether the rule is enabled.
     * 
     */
    @InputImport(name="status", required=true)
      private final Input<BucketReplicationRuleStatus> status;

    public Input<BucketReplicationRuleStatus> getStatus() {
        return this.status;
    }

    public BucketReplicationRuleArgs(
        @Nullable Input<BucketDeleteMarkerReplicationArgs> deleteMarkerReplication,
        Input<BucketReplicationDestinationArgs> destination,
        @Nullable Input<BucketReplicationRuleFilterArgs> filter,
        @Nullable Input<String> id,
        @Nullable Input<String> prefix,
        @Nullable Input<Integer> priority,
        @Nullable Input<BucketSourceSelectionCriteriaArgs> sourceSelectionCriteria,
        Input<BucketReplicationRuleStatus> status) {
        this.deleteMarkerReplication = deleteMarkerReplication;
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.filter = filter;
        this.id = id;
        this.prefix = prefix;
        this.priority = priority;
        this.sourceSelectionCriteria = sourceSelectionCriteria;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private BucketReplicationRuleArgs() {
        this.deleteMarkerReplication = Input.empty();
        this.destination = Input.empty();
        this.filter = Input.empty();
        this.id = Input.empty();
        this.prefix = Input.empty();
        this.priority = Input.empty();
        this.sourceSelectionCriteria = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BucketDeleteMarkerReplicationArgs> deleteMarkerReplication;
        private Input<BucketReplicationDestinationArgs> destination;
        private @Nullable Input<BucketReplicationRuleFilterArgs> filter;
        private @Nullable Input<String> id;
        private @Nullable Input<String> prefix;
        private @Nullable Input<Integer> priority;
        private @Nullable Input<BucketSourceSelectionCriteriaArgs> sourceSelectionCriteria;
        private Input<BucketReplicationRuleStatus> status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteMarkerReplication = defaults.deleteMarkerReplication;
    	      this.destination = defaults.destination;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.prefix = defaults.prefix;
    	      this.priority = defaults.priority;
    	      this.sourceSelectionCriteria = defaults.sourceSelectionCriteria;
    	      this.status = defaults.status;
        }

        public Builder deleteMarkerReplication(@Nullable Input<BucketDeleteMarkerReplicationArgs> deleteMarkerReplication) {
            this.deleteMarkerReplication = deleteMarkerReplication;
            return this;
        }

        public Builder deleteMarkerReplication(@Nullable BucketDeleteMarkerReplicationArgs deleteMarkerReplication) {
            this.deleteMarkerReplication = Input.ofNullable(deleteMarkerReplication);
            return this;
        }

        public Builder destination(Input<BucketReplicationDestinationArgs> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder destination(BucketReplicationDestinationArgs destination) {
            this.destination = Input.of(Objects.requireNonNull(destination));
            return this;
        }

        public Builder filter(@Nullable Input<BucketReplicationRuleFilterArgs> filter) {
            this.filter = filter;
            return this;
        }

        public Builder filter(@Nullable BucketReplicationRuleFilterArgs filter) {
            this.filter = Input.ofNullable(filter);
            return this;
        }

        public Builder id(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder prefix(@Nullable Input<String> prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder prefix(@Nullable String prefix) {
            this.prefix = Input.ofNullable(prefix);
            return this;
        }

        public Builder priority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder priority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder sourceSelectionCriteria(@Nullable Input<BucketSourceSelectionCriteriaArgs> sourceSelectionCriteria) {
            this.sourceSelectionCriteria = sourceSelectionCriteria;
            return this;
        }

        public Builder sourceSelectionCriteria(@Nullable BucketSourceSelectionCriteriaArgs sourceSelectionCriteria) {
            this.sourceSelectionCriteria = Input.ofNullable(sourceSelectionCriteria);
            return this;
        }

        public Builder status(Input<BucketReplicationRuleStatus> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder status(BucketReplicationRuleStatus status) {
            this.status = Input.of(Objects.requireNonNull(status));
            return this;
        }
        public BucketReplicationRuleArgs build() {
            return new BucketReplicationRuleArgs(deleteMarkerReplication, destination, filter, id, prefix, priority, sourceSelectionCriteria, status);
        }
    }
}
