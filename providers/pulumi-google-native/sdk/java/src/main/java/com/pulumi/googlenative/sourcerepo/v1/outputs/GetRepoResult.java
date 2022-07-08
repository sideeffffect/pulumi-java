// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sourcerepo.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.sourcerepo.v1.outputs.MirrorConfigResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetRepoResult {
    /**
     * @return How this repository mirrors a repository managed by another service. Read-only field.
     * 
     */
    private final MirrorConfigResponse mirrorConfig;
    /**
     * @return Resource name of the repository, of the form `projects//repos/`. The repo name may contain slashes. eg, `projects/myproject/repos/name/with/slash`
     * 
     */
    private final String name;
    /**
     * @return How this repository publishes a change in the repository through Cloud Pub/Sub. Keyed by the topic names.
     * 
     */
    private final Map<String,String> pubsubConfigs;
    /**
     * @return The disk usage of the repo, in bytes. Read-only field. Size is only returned by GetRepo.
     * 
     */
    private final String size;
    /**
     * @return URL to clone the repository from Google Cloud Source Repositories. Read-only field.
     * 
     */
    private final String url;

    @CustomType.Constructor
    private GetRepoResult(
        @CustomType.Parameter("mirrorConfig") MirrorConfigResponse mirrorConfig,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("pubsubConfigs") Map<String,String> pubsubConfigs,
        @CustomType.Parameter("size") String size,
        @CustomType.Parameter("url") String url) {
        this.mirrorConfig = mirrorConfig;
        this.name = name;
        this.pubsubConfigs = pubsubConfigs;
        this.size = size;
        this.url = url;
    }

    /**
     * @return How this repository mirrors a repository managed by another service. Read-only field.
     * 
     */
    public MirrorConfigResponse mirrorConfig() {
        return this.mirrorConfig;
    }
    /**
     * @return Resource name of the repository, of the form `projects//repos/`. The repo name may contain slashes. eg, `projects/myproject/repos/name/with/slash`
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return How this repository publishes a change in the repository through Cloud Pub/Sub. Keyed by the topic names.
     * 
     */
    public Map<String,String> pubsubConfigs() {
        return this.pubsubConfigs;
    }
    /**
     * @return The disk usage of the repo, in bytes. Read-only field. Size is only returned by GetRepo.
     * 
     */
    public String size() {
        return this.size;
    }
    /**
     * @return URL to clone the repository from Google Cloud Source Repositories. Read-only field.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepoResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MirrorConfigResponse mirrorConfig;
        private String name;
        private Map<String,String> pubsubConfigs;
        private String size;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRepoResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mirrorConfig = defaults.mirrorConfig;
    	      this.name = defaults.name;
    	      this.pubsubConfigs = defaults.pubsubConfigs;
    	      this.size = defaults.size;
    	      this.url = defaults.url;
        }

        public Builder mirrorConfig(MirrorConfigResponse mirrorConfig) {
            this.mirrorConfig = Objects.requireNonNull(mirrorConfig);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder pubsubConfigs(Map<String,String> pubsubConfigs) {
            this.pubsubConfigs = Objects.requireNonNull(pubsubConfigs);
            return this;
        }
        public Builder size(String size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public GetRepoResult build() {
            return new GetRepoResult(mirrorConfig, name, pubsubConfigs, size, url);
        }
    }
}
