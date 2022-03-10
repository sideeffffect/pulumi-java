// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * TrafficTarget holds a single entry of the routing table for a Route.
 * 
 */
public final class TrafficTargetResponse extends io.pulumi.resources.InvokeArgs {

    public static final TrafficTargetResponse Empty = new TrafficTargetResponse();

    /**
     * ConfigurationName of a configuration to whose latest revision we will send this portion of traffic. When the "status.latestReadyRevisionName" of the referenced configuration changes, we will automatically migrate traffic from the prior "latest ready" revision to the new one. This field is never set in Route's status, only its spec. This is mutually exclusive with RevisionName. Cloud Run currently supports a single ConfigurationName.
     * 
     */
    @InputImport(name="configurationName", required=true)
      private final String configurationName;

    public String getConfigurationName() {
        return this.configurationName;
    }

    /**
     * Optional. LatestRevision may be provided to indicate that the latest ready Revision of the Configuration should be used for this traffic target. When provided LatestRevision must be true if RevisionName is empty; it must be false when RevisionName is non-empty.
     * 
     */
    @InputImport(name="latestRevision", required=true)
      private final Boolean latestRevision;

    public Boolean getLatestRevision() {
        return this.latestRevision;
    }

    /**
     * Percent specifies percent of the traffic to this Revision or Configuration. This defaults to zero if unspecified.
     * 
     */
    @InputImport(name="percent", required=true)
      private final Integer percent;

    public Integer getPercent() {
        return this.percent;
    }

    /**
     * RevisionName of a specific revision to which to send this portion of traffic. This is mutually exclusive with ConfigurationName.
     * 
     */
    @InputImport(name="revisionName", required=true)
      private final String revisionName;

    public String getRevisionName() {
        return this.revisionName;
    }

    /**
     * Optional. Tag is used to expose a dedicated url for referencing this target exclusively.
     * 
     */
    @InputImport(name="tag", required=true)
      private final String tag;

    public String getTag() {
        return this.tag;
    }

    /**
     * URL displays the URL for accessing tagged traffic targets. URL is displayed in status, and is disallowed on spec. URL must contain a scheme (e.g. http://) and a hostname, but may not contain anything else (e.g. basic auth, url path, etc.)
     * 
     */
    @InputImport(name="url", required=true)
      private final String url;

    public String getUrl() {
        return this.url;
    }

    public TrafficTargetResponse(
        String configurationName,
        Boolean latestRevision,
        Integer percent,
        String revisionName,
        String tag,
        String url) {
        this.configurationName = Objects.requireNonNull(configurationName, "expected parameter 'configurationName' to be non-null");
        this.latestRevision = Objects.requireNonNull(latestRevision, "expected parameter 'latestRevision' to be non-null");
        this.percent = Objects.requireNonNull(percent, "expected parameter 'percent' to be non-null");
        this.revisionName = Objects.requireNonNull(revisionName, "expected parameter 'revisionName' to be non-null");
        this.tag = Objects.requireNonNull(tag, "expected parameter 'tag' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private TrafficTargetResponse() {
        this.configurationName = null;
        this.latestRevision = null;
        this.percent = null;
        this.revisionName = null;
        this.tag = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrafficTargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String configurationName;
        private Boolean latestRevision;
        private Integer percent;
        private String revisionName;
        private String tag;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(TrafficTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationName = defaults.configurationName;
    	      this.latestRevision = defaults.latestRevision;
    	      this.percent = defaults.percent;
    	      this.revisionName = defaults.revisionName;
    	      this.tag = defaults.tag;
    	      this.url = defaults.url;
        }

        public Builder configurationName(String configurationName) {
            this.configurationName = Objects.requireNonNull(configurationName);
            return this;
        }

        public Builder latestRevision(Boolean latestRevision) {
            this.latestRevision = Objects.requireNonNull(latestRevision);
            return this;
        }

        public Builder percent(Integer percent) {
            this.percent = Objects.requireNonNull(percent);
            return this;
        }

        public Builder revisionName(String revisionName) {
            this.revisionName = Objects.requireNonNull(revisionName);
            return this;
        }

        public Builder tag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }

        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public TrafficTargetResponse build() {
            return new TrafficTargetResponse(configurationName, latestRevision, percent, revisionName, tag, url);
        }
    }
}
