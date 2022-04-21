// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class GetServiceTemplateMetadata extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceTemplateMetadata Empty = new GetServiceTemplateMetadata();

    @Import(name="annotations", required=true)
    private Map<String,String> annotations;

    public Map<String,String> annotations() {
        return this.annotations;
    }

    @Import(name="generation", required=true)
    private Integer generation;

    public Integer generation() {
        return this.generation;
    }

    @Import(name="labels", required=true)
    private Map<String,String> labels;

    public Map<String,String> labels() {
        return this.labels;
    }

    /**
     * The name of the Cloud Run Service.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    @Import(name="namespace", required=true)
    private String namespace;

    public String namespace() {
        return this.namespace;
    }

    @Import(name="resourceVersion", required=true)
    private String resourceVersion;

    public String resourceVersion() {
        return this.resourceVersion;
    }

    @Import(name="selfLink", required=true)
    private String selfLink;

    public String selfLink() {
        return this.selfLink;
    }

    @Import(name="uid", required=true)
    private String uid;

    public String uid() {
        return this.uid;
    }

    private GetServiceTemplateMetadata() {}

    private GetServiceTemplateMetadata(GetServiceTemplateMetadata $) {
        this.annotations = $.annotations;
        this.generation = $.generation;
        this.labels = $.labels;
        this.name = $.name;
        this.namespace = $.namespace;
        this.resourceVersion = $.resourceVersion;
        this.selfLink = $.selfLink;
        this.uid = $.uid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceTemplateMetadata defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceTemplateMetadata $;

        public Builder() {
            $ = new GetServiceTemplateMetadata();
        }

        public Builder(GetServiceTemplateMetadata defaults) {
            $ = new GetServiceTemplateMetadata(Objects.requireNonNull(defaults));
        }

        public Builder annotations(Map<String,String> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder generation(Integer generation) {
            $.generation = generation;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            $.labels = labels;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder namespace(String namespace) {
            $.namespace = namespace;
            return this;
        }

        public Builder resourceVersion(String resourceVersion) {
            $.resourceVersion = resourceVersion;
            return this;
        }

        public Builder selfLink(String selfLink) {
            $.selfLink = selfLink;
            return this;
        }

        public Builder uid(String uid) {
            $.uid = uid;
            return this;
        }

        public GetServiceTemplateMetadata build() {
            $.annotations = Objects.requireNonNull($.annotations, "expected parameter 'annotations' to be non-null");
            $.generation = Objects.requireNonNull($.generation, "expected parameter 'generation' to be non-null");
            $.labels = Objects.requireNonNull($.labels, "expected parameter 'labels' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.namespace = Objects.requireNonNull($.namespace, "expected parameter 'namespace' to be non-null");
            $.resourceVersion = Objects.requireNonNull($.resourceVersion, "expected parameter 'resourceVersion' to be non-null");
            $.selfLink = Objects.requireNonNull($.selfLink, "expected parameter 'selfLink' to be non-null");
            $.uid = Objects.requireNonNull($.uid, "expected parameter 'uid' to be non-null");
            return $;
        }
    }

}
