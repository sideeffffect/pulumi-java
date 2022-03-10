// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.AssetStreamingLocatorResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ListAssetStreamingLocatorsResult {
    /**
     * The list of Streaming Locators.
     * 
     */
    private final List<AssetStreamingLocatorResponse> streamingLocators;

    @OutputCustomType.Constructor
    private ListAssetStreamingLocatorsResult(@OutputCustomType.Parameter("streamingLocators") List<AssetStreamingLocatorResponse> streamingLocators) {
        this.streamingLocators = streamingLocators;
    }

    /**
     * The list of Streaming Locators.
     * 
    */
    public List<AssetStreamingLocatorResponse> getStreamingLocators() {
        return this.streamingLocators;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListAssetStreamingLocatorsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AssetStreamingLocatorResponse> streamingLocators;

        public Builder() {
    	      // Empty
        }

        public Builder(ListAssetStreamingLocatorsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.streamingLocators = defaults.streamingLocators;
        }

        public Builder streamingLocators(List<AssetStreamingLocatorResponse> streamingLocators) {
            this.streamingLocators = Objects.requireNonNull(streamingLocators);
            return this;
        }
        public ListAssetStreamingLocatorsResult build() {
            return new ListAssetStreamingLocatorsResult(streamingLocators);
        }
    }
}
