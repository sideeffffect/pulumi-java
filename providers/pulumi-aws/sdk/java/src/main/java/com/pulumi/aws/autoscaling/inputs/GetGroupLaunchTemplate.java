// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGroupLaunchTemplate extends com.pulumi.resources.InvokeArgs {

    public static final GetGroupLaunchTemplate Empty = new GetGroupLaunchTemplate();

    /**
     * Name of the Auto Scaling Group.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    /**
     * Specify the exact name of the desired autoscaling group.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    @Import(name="version", required=true)
    private String version;

    public String version() {
        return this.version;
    }

    private GetGroupLaunchTemplate() {}

    private GetGroupLaunchTemplate(GetGroupLaunchTemplate $) {
        this.id = $.id;
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGroupLaunchTemplate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGroupLaunchTemplate $;

        public Builder() {
            $ = new GetGroupLaunchTemplate();
        }

        public Builder(GetGroupLaunchTemplate defaults) {
            $ = new GetGroupLaunchTemplate(Objects.requireNonNull(defaults));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder version(String version) {
            $.version = version;
            return this;
        }

        public GetGroupLaunchTemplate build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
