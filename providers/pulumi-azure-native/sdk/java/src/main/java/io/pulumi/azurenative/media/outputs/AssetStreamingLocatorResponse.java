// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AssetStreamingLocatorResponse {
    /**
     * Asset Name.
     * 
     */
    private final String assetName;
    /**
     * The creation time of the Streaming Locator.
     * 
     */
    private final String created;
    /**
     * Name of the default ContentKeyPolicy used by this Streaming Locator.
     * 
     */
    private final String defaultContentKeyPolicyName;
    /**
     * The end time of the Streaming Locator.
     * 
     */
    private final String endTime;
    /**
     * Streaming Locator name.
     * 
     */
    private final String name;
    /**
     * The start time of the Streaming Locator.
     * 
     */
    private final String startTime;
    /**
     * StreamingLocatorId of the Streaming Locator.
     * 
     */
    private final String streamingLocatorId;
    /**
     * Name of the Streaming Policy used by this Streaming Locator.
     * 
     */
    private final String streamingPolicyName;

    @OutputCustomType.Constructor({"assetName","created","defaultContentKeyPolicyName","endTime","name","startTime","streamingLocatorId","streamingPolicyName"})
    private AssetStreamingLocatorResponse(
        String assetName,
        String created,
        String defaultContentKeyPolicyName,
        String endTime,
        String name,
        String startTime,
        String streamingLocatorId,
        String streamingPolicyName) {
        this.assetName = assetName;
        this.created = created;
        this.defaultContentKeyPolicyName = defaultContentKeyPolicyName;
        this.endTime = endTime;
        this.name = name;
        this.startTime = startTime;
        this.streamingLocatorId = streamingLocatorId;
        this.streamingPolicyName = streamingPolicyName;
    }

    /**
     * Asset Name.
     * 
    */
    public String getAssetName() {
        return this.assetName;
    }
    /**
     * The creation time of the Streaming Locator.
     * 
    */
    public String getCreated() {
        return this.created;
    }
    /**
     * Name of the default ContentKeyPolicy used by this Streaming Locator.
     * 
    */
    public String getDefaultContentKeyPolicyName() {
        return this.defaultContentKeyPolicyName;
    }
    /**
     * The end time of the Streaming Locator.
     * 
    */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * Streaming Locator name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The start time of the Streaming Locator.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * StreamingLocatorId of the Streaming Locator.
     * 
    */
    public String getStreamingLocatorId() {
        return this.streamingLocatorId;
    }
    /**
     * Name of the Streaming Policy used by this Streaming Locator.
     * 
    */
    public String getStreamingPolicyName() {
        return this.streamingPolicyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetStreamingLocatorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assetName;
        private String created;
        private String defaultContentKeyPolicyName;
        private String endTime;
        private String name;
        private String startTime;
        private String streamingLocatorId;
        private String streamingPolicyName;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetStreamingLocatorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetName = defaults.assetName;
    	      this.created = defaults.created;
    	      this.defaultContentKeyPolicyName = defaults.defaultContentKeyPolicyName;
    	      this.endTime = defaults.endTime;
    	      this.name = defaults.name;
    	      this.startTime = defaults.startTime;
    	      this.streamingLocatorId = defaults.streamingLocatorId;
    	      this.streamingPolicyName = defaults.streamingPolicyName;
        }

        public Builder setAssetName(String assetName) {
            this.assetName = Objects.requireNonNull(assetName);
            return this;
        }

        public Builder setCreated(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }

        public Builder setDefaultContentKeyPolicyName(String defaultContentKeyPolicyName) {
            this.defaultContentKeyPolicyName = Objects.requireNonNull(defaultContentKeyPolicyName);
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setStreamingLocatorId(String streamingLocatorId) {
            this.streamingLocatorId = Objects.requireNonNull(streamingLocatorId);
            return this;
        }

        public Builder setStreamingPolicyName(String streamingPolicyName) {
            this.streamingPolicyName = Objects.requireNonNull(streamingPolicyName);
            return this;
        }
        public AssetStreamingLocatorResponse build() {
            return new AssetStreamingLocatorResponse(assetName, created, defaultContentKeyPolicyName, endTime, name, startTime, streamingLocatorId, streamingPolicyName);
        }
    }
}
