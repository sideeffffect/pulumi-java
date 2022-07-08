// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream.v1alpha1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteArgs Empty = new RouteArgs();

    /**
     * Destination address for connection
     * 
     */
    @Import(name="destinationAddress", required=true)
    private Output<String> destinationAddress;

    /**
     * @return Destination address for connection
     * 
     */
    public Output<String> destinationAddress() {
        return this.destinationAddress;
    }

    /**
     * Destination port for connection
     * 
     */
    @Import(name="destinationPort")
    private @Nullable Output<Integer> destinationPort;

    /**
     * @return Destination port for connection
     * 
     */
    public Optional<Output<Integer>> destinationPort() {
        return Optional.ofNullable(this.destinationPort);
    }

    /**
     * Display name.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return Display name.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Labels.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="privateConnectionId", required=true)
    private Output<String> privateConnectionId;

    public Output<String> privateConnectionId() {
        return this.privateConnectionId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    /**
     * @return Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * Required. The Route identifier.
     * 
     */
    @Import(name="routeId", required=true)
    private Output<String> routeId;

    /**
     * @return Required. The Route identifier.
     * 
     */
    public Output<String> routeId() {
        return this.routeId;
    }

    private RouteArgs() {}

    private RouteArgs(RouteArgs $) {
        this.destinationAddress = $.destinationAddress;
        this.destinationPort = $.destinationPort;
        this.displayName = $.displayName;
        this.labels = $.labels;
        this.location = $.location;
        this.privateConnectionId = $.privateConnectionId;
        this.project = $.project;
        this.requestId = $.requestId;
        this.routeId = $.routeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteArgs $;

        public Builder() {
            $ = new RouteArgs();
        }

        public Builder(RouteArgs defaults) {
            $ = new RouteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinationAddress Destination address for connection
         * 
         * @return builder
         * 
         */
        public Builder destinationAddress(Output<String> destinationAddress) {
            $.destinationAddress = destinationAddress;
            return this;
        }

        /**
         * @param destinationAddress Destination address for connection
         * 
         * @return builder
         * 
         */
        public Builder destinationAddress(String destinationAddress) {
            return destinationAddress(Output.of(destinationAddress));
        }

        /**
         * @param destinationPort Destination port for connection
         * 
         * @return builder
         * 
         */
        public Builder destinationPort(@Nullable Output<Integer> destinationPort) {
            $.destinationPort = destinationPort;
            return this;
        }

        /**
         * @param destinationPort Destination port for connection
         * 
         * @return builder
         * 
         */
        public Builder destinationPort(Integer destinationPort) {
            return destinationPort(Output.of(destinationPort));
        }

        /**
         * @param displayName Display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param labels Labels.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder privateConnectionId(Output<String> privateConnectionId) {
            $.privateConnectionId = privateConnectionId;
            return this;
        }

        public Builder privateConnectionId(String privateConnectionId) {
            return privateConnectionId(Output.of(privateConnectionId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param requestId Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        /**
         * @param requestId Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param routeId Required. The Route identifier.
         * 
         * @return builder
         * 
         */
        public Builder routeId(Output<String> routeId) {
            $.routeId = routeId;
            return this;
        }

        /**
         * @param routeId Required. The Route identifier.
         * 
         * @return builder
         * 
         */
        public Builder routeId(String routeId) {
            return routeId(Output.of(routeId));
        }

        public RouteArgs build() {
            $.destinationAddress = Objects.requireNonNull($.destinationAddress, "expected parameter 'destinationAddress' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.privateConnectionId = Objects.requireNonNull($.privateConnectionId, "expected parameter 'privateConnectionId' to be non-null");
            $.routeId = Objects.requireNonNull($.routeId, "expected parameter 'routeId' to be non-null");
            return $;
        }
    }

}
