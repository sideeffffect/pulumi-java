// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class YarnApplicationResponse {
    /**
     * The application name.
     * 
     */
    private final String name;
    /**
     * The numerical progress of the application, from 1 to 100.
     * 
     */
    private final Double progress;
    /**
     * The application state.
     * 
     */
    private final String state;
    /**
     * Optional. The HTTP URL of the ApplicationMaster, HistoryServer, or TimelineServer that provides application-specific information. The URL uses the internal hostname, and requires a proxy server for resolution and, possibly, access.
     * 
     */
    private final String trackingUrl;

    @OutputCustomType.Constructor
    private YarnApplicationResponse(
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("progress") Double progress,
        @OutputCustomType.Parameter("state") String state,
        @OutputCustomType.Parameter("trackingUrl") String trackingUrl) {
        this.name = name;
        this.progress = progress;
        this.state = state;
        this.trackingUrl = trackingUrl;
    }

    /**
     * The application name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The numerical progress of the application, from 1 to 100.
     * 
    */
    public Double getProgress() {
        return this.progress;
    }
    /**
     * The application state.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Optional. The HTTP URL of the ApplicationMaster, HistoryServer, or TimelineServer that provides application-specific information. The URL uses the internal hostname, and requires a proxy server for resolution and, possibly, access.
     * 
    */
    public String getTrackingUrl() {
        return this.trackingUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(YarnApplicationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private Double progress;
        private String state;
        private String trackingUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(YarnApplicationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.progress = defaults.progress;
    	      this.state = defaults.state;
    	      this.trackingUrl = defaults.trackingUrl;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder progress(Double progress) {
            this.progress = Objects.requireNonNull(progress);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder trackingUrl(String trackingUrl) {
            this.trackingUrl = Objects.requireNonNull(trackingUrl);
            return this;
        }
        public YarnApplicationResponse build() {
            return new YarnApplicationResponse(name, progress, state, trackingUrl);
        }
    }
}
