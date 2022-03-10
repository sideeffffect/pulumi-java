// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.run_v1.inputs.GoogleCloudRunV1ConditionArgs;
import io.pulumi.googlenative.run_v1.inputs.ResourceRecordArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The current state of the Domain Mapping.
 * 
 */
public final class DomainMappingStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainMappingStatusArgs Empty = new DomainMappingStatusArgs();

    /**
     * Array of observed DomainMappingConditions, indicating the current state of the DomainMapping.
     * 
     */
    @InputImport(name="conditions")
      private final @Nullable Input<List<GoogleCloudRunV1ConditionArgs>> conditions;

    public Input<List<GoogleCloudRunV1ConditionArgs>> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    /**
     * The name of the route that the mapping currently points to.
     * 
     */
    @InputImport(name="mappedRouteName")
      private final @Nullable Input<String> mappedRouteName;

    public Input<String> getMappedRouteName() {
        return this.mappedRouteName == null ? Input.empty() : this.mappedRouteName;
    }

    /**
     * ObservedGeneration is the 'Generation' of the DomainMapping that was last processed by the controller. Clients polling for completed reconciliation should poll until observedGeneration = metadata.generation and the Ready condition's status is True or False.
     * 
     */
    @InputImport(name="observedGeneration")
      private final @Nullable Input<Integer> observedGeneration;

    public Input<Integer> getObservedGeneration() {
        return this.observedGeneration == null ? Input.empty() : this.observedGeneration;
    }

    /**
     * The resource records required to configure this domain mapping. These records must be added to the domain's DNS configuration in order to serve the application via this domain mapping.
     * 
     */
    @InputImport(name="resourceRecords")
      private final @Nullable Input<List<ResourceRecordArgs>> resourceRecords;

    public Input<List<ResourceRecordArgs>> getResourceRecords() {
        return this.resourceRecords == null ? Input.empty() : this.resourceRecords;
    }

    /**
     * Optional. Cloud Run fully managed: not supported Cloud Run on GKE: supported Holds the URL that will serve the traffic of the DomainMapping.
     * 
     */
    @InputImport(name="url")
      private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    public DomainMappingStatusArgs(
        @Nullable Input<List<GoogleCloudRunV1ConditionArgs>> conditions,
        @Nullable Input<String> mappedRouteName,
        @Nullable Input<Integer> observedGeneration,
        @Nullable Input<List<ResourceRecordArgs>> resourceRecords,
        @Nullable Input<String> url) {
        this.conditions = conditions;
        this.mappedRouteName = mappedRouteName;
        this.observedGeneration = observedGeneration;
        this.resourceRecords = resourceRecords;
        this.url = url;
    }

    private DomainMappingStatusArgs() {
        this.conditions = Input.empty();
        this.mappedRouteName = Input.empty();
        this.observedGeneration = Input.empty();
        this.resourceRecords = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainMappingStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<GoogleCloudRunV1ConditionArgs>> conditions;
        private @Nullable Input<String> mappedRouteName;
        private @Nullable Input<Integer> observedGeneration;
        private @Nullable Input<List<ResourceRecordArgs>> resourceRecords;
        private @Nullable Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainMappingStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.mappedRouteName = defaults.mappedRouteName;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.resourceRecords = defaults.resourceRecords;
    	      this.url = defaults.url;
        }

        public Builder conditions(@Nullable Input<List<GoogleCloudRunV1ConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder conditions(@Nullable List<GoogleCloudRunV1ConditionArgs> conditions) {
            this.conditions = Input.ofNullable(conditions);
            return this;
        }

        public Builder mappedRouteName(@Nullable Input<String> mappedRouteName) {
            this.mappedRouteName = mappedRouteName;
            return this;
        }

        public Builder mappedRouteName(@Nullable String mappedRouteName) {
            this.mappedRouteName = Input.ofNullable(mappedRouteName);
            return this;
        }

        public Builder observedGeneration(@Nullable Input<Integer> observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        public Builder observedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = Input.ofNullable(observedGeneration);
            return this;
        }

        public Builder resourceRecords(@Nullable Input<List<ResourceRecordArgs>> resourceRecords) {
            this.resourceRecords = resourceRecords;
            return this;
        }

        public Builder resourceRecords(@Nullable List<ResourceRecordArgs> resourceRecords) {
            this.resourceRecords = Input.ofNullable(resourceRecords);
            return this;
        }

        public Builder url(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder url(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }
        public DomainMappingStatusArgs build() {
            return new DomainMappingStatusArgs(conditions, mappedRouteName, observedGeneration, resourceRecords, url);
        }
    }
}
