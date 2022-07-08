// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceGroupManagerResizeRequestPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceGroupManagerResizeRequestPlainArgs Empty = new GetInstanceGroupManagerResizeRequestPlainArgs();

    @Import(name="instanceGroupManager", required=true)
    private String instanceGroupManager;

    public String instanceGroupManager() {
        return this.instanceGroupManager;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="resizeRequest", required=true)
    private String resizeRequest;

    public String resizeRequest() {
        return this.resizeRequest;
    }

    @Import(name="zone", required=true)
    private String zone;

    public String zone() {
        return this.zone;
    }

    private GetInstanceGroupManagerResizeRequestPlainArgs() {}

    private GetInstanceGroupManagerResizeRequestPlainArgs(GetInstanceGroupManagerResizeRequestPlainArgs $) {
        this.instanceGroupManager = $.instanceGroupManager;
        this.project = $.project;
        this.resizeRequest = $.resizeRequest;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceGroupManagerResizeRequestPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceGroupManagerResizeRequestPlainArgs $;

        public Builder() {
            $ = new GetInstanceGroupManagerResizeRequestPlainArgs();
        }

        public Builder(GetInstanceGroupManagerResizeRequestPlainArgs defaults) {
            $ = new GetInstanceGroupManagerResizeRequestPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder instanceGroupManager(String instanceGroupManager) {
            $.instanceGroupManager = instanceGroupManager;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder resizeRequest(String resizeRequest) {
            $.resizeRequest = resizeRequest;
            return this;
        }

        public Builder zone(String zone) {
            $.zone = zone;
            return this;
        }

        public GetInstanceGroupManagerResizeRequestPlainArgs build() {
            $.instanceGroupManager = Objects.requireNonNull($.instanceGroupManager, "expected parameter 'instanceGroupManager' to be non-null");
            $.resizeRequest = Objects.requireNonNull($.resizeRequest, "expected parameter 'resizeRequest' to be non-null");
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
