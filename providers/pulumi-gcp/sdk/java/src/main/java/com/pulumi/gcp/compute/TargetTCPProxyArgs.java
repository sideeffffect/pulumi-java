// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TargetTCPProxyArgs extends ResourceArgs {

    public static final TargetTCPProxyArgs Empty = new TargetTCPProxyArgs();

    /**
     * A reference to the BackendService resource.
     * 
     */
    @Import(name="backendService", required=true)
    private Output<String> backendService;

    /**
     * @return A reference to the BackendService resource.
     * 
     */
    public Output<String> backendService() {
        return this.backendService;
    }

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * This field only applies when the forwarding rule that references
     * this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    @Import(name="proxyBind")
    private @Nullable Output<Boolean> proxyBind;

    /**
     * @return This field only applies when the forwarding rule that references
     * this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    public Optional<Output<Boolean>> proxyBind() {
        return Optional.ofNullable(this.proxyBind);
    }

    /**
     * Specifies the type of proxy header to append before sending data to
     * the backend.
     * Default value is `NONE`.
     * Possible values are `NONE` and `PROXY_V1`.
     * 
     */
    @Import(name="proxyHeader")
    private @Nullable Output<String> proxyHeader;

    /**
     * @return Specifies the type of proxy header to append before sending data to
     * the backend.
     * Default value is `NONE`.
     * Possible values are `NONE` and `PROXY_V1`.
     * 
     */
    public Optional<Output<String>> proxyHeader() {
        return Optional.ofNullable(this.proxyHeader);
    }

    private TargetTCPProxyArgs() {}

    private TargetTCPProxyArgs(TargetTCPProxyArgs $) {
        this.backendService = $.backendService;
        this.description = $.description;
        this.name = $.name;
        this.project = $.project;
        this.proxyBind = $.proxyBind;
        this.proxyHeader = $.proxyHeader;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TargetTCPProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TargetTCPProxyArgs $;

        public Builder() {
            $ = new TargetTCPProxyArgs();
        }

        public Builder(TargetTCPProxyArgs defaults) {
            $ = new TargetTCPProxyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendService A reference to the BackendService resource.
         * 
         * @return builder
         * 
         */
        public Builder backendService(Output<String> backendService) {
            $.backendService = backendService;
            return this;
        }

        /**
         * @param backendService A reference to the BackendService resource.
         * 
         * @return builder
         * 
         */
        public Builder backendService(String backendService) {
            return backendService(Output.of(backendService));
        }

        /**
         * @param description An optional description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is
         * created. The name must be 1-63 characters long, and comply with
         * RFC1035. Specifically, the name must be 1-63 characters long and match
         * the regular expression `a-z?` which means the
         * first character must be a lowercase letter, and all following
         * characters must be a dash, lowercase letter, or digit, except the last
         * character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is
         * created. The name must be 1-63 characters long, and comply with
         * RFC1035. Specifically, the name must be 1-63 characters long and match
         * the regular expression `a-z?` which means the
         * first character must be a lowercase letter, and all following
         * characters must be a dash, lowercase letter, or digit, except the last
         * character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param proxyBind This field only applies when the forwarding rule that references
         * this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED.
         * 
         * @return builder
         * 
         */
        public Builder proxyBind(@Nullable Output<Boolean> proxyBind) {
            $.proxyBind = proxyBind;
            return this;
        }

        /**
         * @param proxyBind This field only applies when the forwarding rule that references
         * this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED.
         * 
         * @return builder
         * 
         */
        public Builder proxyBind(Boolean proxyBind) {
            return proxyBind(Output.of(proxyBind));
        }

        /**
         * @param proxyHeader Specifies the type of proxy header to append before sending data to
         * the backend.
         * Default value is `NONE`.
         * Possible values are `NONE` and `PROXY_V1`.
         * 
         * @return builder
         * 
         */
        public Builder proxyHeader(@Nullable Output<String> proxyHeader) {
            $.proxyHeader = proxyHeader;
            return this;
        }

        /**
         * @param proxyHeader Specifies the type of proxy header to append before sending data to
         * the backend.
         * Default value is `NONE`.
         * Possible values are `NONE` and `PROXY_V1`.
         * 
         * @return builder
         * 
         */
        public Builder proxyHeader(String proxyHeader) {
            return proxyHeader(Output.of(proxyHeader));
        }

        public TargetTCPProxyArgs build() {
            $.backendService = Objects.requireNonNull($.backendService, "expected parameter 'backendService' to be non-null");
            return $;
        }
    }

}
