// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetMeshResult {
    /**
     * @return The timestamp when the resource was created.
     * 
     */
    private final String createTime;
    /**
     * @return Optional. A free-text description of the resource. Max length 1024 characters.
     * 
     */
    private final String description;
    /**
     * @return Optional. If set to a valid TCP port (1-65535), instructs the SIDECAR proxy to listen on the specified port of localhost (127.0.0.1) address. The SIDECAR proxy will expect all traffic to be redirected to this port regardless of its actual ip:port destination. If unset, a port &#39;15001&#39; is used as the interception port. This will is applicable only for sidecar proxy deployments.
     * 
     */
    private final Integer interceptionPort;
    /**
     * @return Optional. Set of label tags associated with the Mesh resource.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return Name of the Mesh resource. It matches pattern `projects/*{@literal /}locations/global/meshes/`.
     * 
     */
    private final String name;
    /**
     * @return Server-defined URL of this resource
     * 
     */
    private final String selfLink;
    /**
     * @return The timestamp when the resource was updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetMeshResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("interceptionPort") Integer interceptionPort,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.interceptionPort = interceptionPort;
        this.labels = labels;
        this.name = name;
        this.selfLink = selfLink;
        this.updateTime = updateTime;
    }

    /**
     * @return The timestamp when the resource was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Optional. A free-text description of the resource. Max length 1024 characters.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Optional. If set to a valid TCP port (1-65535), instructs the SIDECAR proxy to listen on the specified port of localhost (127.0.0.1) address. The SIDECAR proxy will expect all traffic to be redirected to this port regardless of its actual ip:port destination. If unset, a port &#39;15001&#39; is used as the interception port. This will is applicable only for sidecar proxy deployments.
     * 
     */
    public Integer interceptionPort() {
        return this.interceptionPort;
    }
    /**
     * @return Optional. Set of label tags associated with the Mesh resource.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Name of the Mesh resource. It matches pattern `projects/*{@literal /}locations/global/meshes/`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Server-defined URL of this resource
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return The timestamp when the resource was updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMeshResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private Integer interceptionPort;
        private Map<String,String> labels;
        private String name;
        private String selfLink;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMeshResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.interceptionPort = defaults.interceptionPort;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.selfLink = defaults.selfLink;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder interceptionPort(Integer interceptionPort) {
            this.interceptionPort = Objects.requireNonNull(interceptionPort);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetMeshResult build() {
            return new GetMeshResult(createTime, description, interceptionPort, labels, name, selfLink, updateTime);
        }
    }
}
