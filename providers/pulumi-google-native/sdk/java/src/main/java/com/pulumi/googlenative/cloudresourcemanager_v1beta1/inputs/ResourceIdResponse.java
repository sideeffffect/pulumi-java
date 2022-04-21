// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudresourcemanager_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A container to reference an id for any resource type. A `resource` in Google Cloud Platform is a generic term for something you (a developer) may want to interact with through one of our API&#39;s. Some examples are an App Engine app, a Compute Engine instance, a Cloud SQL database, and so on.
 * 
 */
public final class ResourceIdResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResourceIdResponse Empty = new ResourceIdResponse();

    /**
     * Required field representing the resource type this id is for. At present, the valid types are &#34;project&#34;, &#34;folder&#34;, and &#34;organization&#34;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private ResourceIdResponse() {}

    private ResourceIdResponse(ResourceIdResponse $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceIdResponse $;

        public Builder() {
            $ = new ResourceIdResponse();
        }

        public Builder(ResourceIdResponse defaults) {
            $ = new ResourceIdResponse(Objects.requireNonNull(defaults));
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public ResourceIdResponse build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
