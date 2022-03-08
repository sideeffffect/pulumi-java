// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.cloudrun.outputs.GetServiceStatusCondition;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetServiceStatus {
    private final List<GetServiceStatusCondition> conditions;
    private final String latestCreatedRevisionName;
    private final String latestReadyRevisionName;
    private final Integer observedGeneration;
    private final String url;

    @OutputCustomType.Constructor({"conditions","latestCreatedRevisionName","latestReadyRevisionName","observedGeneration","url"})
    private GetServiceStatus(
        List<GetServiceStatusCondition> conditions,
        String latestCreatedRevisionName,
        String latestReadyRevisionName,
        Integer observedGeneration,
        String url) {
        this.conditions = conditions;
        this.latestCreatedRevisionName = latestCreatedRevisionName;
        this.latestReadyRevisionName = latestReadyRevisionName;
        this.observedGeneration = observedGeneration;
        this.url = url;
    }

    public List<GetServiceStatusCondition> getConditions() {
        return this.conditions;
    }
    public String getLatestCreatedRevisionName() {
        return this.latestCreatedRevisionName;
    }
    public String getLatestReadyRevisionName() {
        return this.latestReadyRevisionName;
    }
    public Integer getObservedGeneration() {
        return this.observedGeneration;
    }
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetServiceStatusCondition> conditions;
        private String latestCreatedRevisionName;
        private String latestReadyRevisionName;
        private Integer observedGeneration;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.latestCreatedRevisionName = defaults.latestCreatedRevisionName;
    	      this.latestReadyRevisionName = defaults.latestReadyRevisionName;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.url = defaults.url;
        }

        public Builder setConditions(List<GetServiceStatusCondition> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }

        public Builder setLatestCreatedRevisionName(String latestCreatedRevisionName) {
            this.latestCreatedRevisionName = Objects.requireNonNull(latestCreatedRevisionName);
            return this;
        }

        public Builder setLatestReadyRevisionName(String latestReadyRevisionName) {
            this.latestReadyRevisionName = Objects.requireNonNull(latestReadyRevisionName);
            return this;
        }

        public Builder setObservedGeneration(Integer observedGeneration) {
            this.observedGeneration = Objects.requireNonNull(observedGeneration);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public GetServiceStatus build() {
            return new GetServiceStatus(conditions, latestCreatedRevisionName, latestReadyRevisionName, observedGeneration, url);
        }
    }
}
