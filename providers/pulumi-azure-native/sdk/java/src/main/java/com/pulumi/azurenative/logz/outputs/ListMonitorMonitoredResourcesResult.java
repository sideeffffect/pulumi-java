// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logz.outputs;

import com.pulumi.azurenative.logz.outputs.MonitoredResourceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListMonitorMonitoredResourcesResult {
    /**
     * Link to the next set of results, if any.
     * 
     */
    private final @Nullable String nextLink;
    /**
     * Results of a list operation.
     * 
     */
    private final @Nullable List<MonitoredResourceResponse> value;

    @CustomType.Constructor
    private ListMonitorMonitoredResourcesResult(
        @CustomType.Parameter("nextLink") @Nullable String nextLink,
        @CustomType.Parameter("value") @Nullable List<MonitoredResourceResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    /**
     * Link to the next set of results, if any.
     * 
    */
    public Optional<String> nextLink() {
        return Optional.ofNullable(this.nextLink);
    }
    /**
     * Results of a list operation.
     * 
    */
    public List<MonitoredResourceResponse> value() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListMonitorMonitoredResourcesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextLink;
        private @Nullable List<MonitoredResourceResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListMonitorMonitoredResourcesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder nextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }
        public Builder value(@Nullable List<MonitoredResourceResponse> value) {
            this.value = value;
            return this;
        }
        public Builder value(MonitoredResourceResponse... value) {
            return value(List.of(value));
        }        public ListMonitorMonitoredResourcesResult build() {
            return new ListMonitorMonitoredResourcesResult(nextLink, value);
        }
    }
}
