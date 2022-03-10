// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.networking.k8s.io_v1.inputs.IngressBackendArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * HTTPIngressPath associates a path with a backend. Incoming urls matching the path are forwarded to the backend.
 * 
 */
public final class HTTPIngressPathArgs extends io.pulumi.resources.ResourceArgs {

    public static final HTTPIngressPathArgs Empty = new HTTPIngressPathArgs();

    /**
     * Backend defines the referenced service endpoint to which the traffic will be forwarded to.
     * 
     */
    @InputImport(name="backend", required=true)
      private final Input<IngressBackendArgs> backend;

    public Input<IngressBackendArgs> getBackend() {
        return this.backend;
    }

    /**
     * Path is matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/' and must be present when using PathType with value "Exact" or "Prefix".
     * 
     */
    @InputImport(name="path")
      private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * PathType determines the interpretation of the Path matching. PathType can be one of the following values: * Exact: Matches the URL path exactly. * Prefix: Matches based on a URL path prefix split by '/'. Matching is
     *   done on a path element by element basis. A path element refers is the
     *   list of labels in the path split by the '/' separator. A request is a
     *   match for path p if every p is an element-wise prefix of p of the
     *   request path. Note that if the last element of the path is a substring
     *   of the last element in request path, it is not a match (e.g. /foo/bar
     *   matches /foo/bar/baz, but does not match /foo/barbaz).
     * * ImplementationSpecific: Interpretation of the Path matching is up to
     *   the IngressClass. Implementations can treat this as a separate PathType
     *   or treat it identically to Prefix or Exact path types.
     *   Implementations are required to support all path types.
     * 
     */
    @InputImport(name="pathType", required=true)
      private final Input<String> pathType;

    public Input<String> getPathType() {
        return this.pathType;
    }

    public HTTPIngressPathArgs(
        Input<IngressBackendArgs> backend,
        @Nullable Input<String> path,
        Input<String> pathType) {
        this.backend = Objects.requireNonNull(backend, "expected parameter 'backend' to be non-null");
        this.path = path;
        this.pathType = Objects.requireNonNull(pathType, "expected parameter 'pathType' to be non-null");
    }

    private HTTPIngressPathArgs() {
        this.backend = Input.empty();
        this.path = Input.empty();
        this.pathType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HTTPIngressPathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<IngressBackendArgs> backend;
        private @Nullable Input<String> path;
        private Input<String> pathType;

        public Builder() {
    	      // Empty
        }

        public Builder(HTTPIngressPathArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backend = defaults.backend;
    	      this.path = defaults.path;
    	      this.pathType = defaults.pathType;
        }

        public Builder backend(Input<IngressBackendArgs> backend) {
            this.backend = Objects.requireNonNull(backend);
            return this;
        }

        public Builder backend(IngressBackendArgs backend) {
            this.backend = Input.of(Objects.requireNonNull(backend));
            return this;
        }

        public Builder path(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder pathType(Input<String> pathType) {
            this.pathType = Objects.requireNonNull(pathType);
            return this;
        }

        public Builder pathType(String pathType) {
            this.pathType = Input.of(Objects.requireNonNull(pathType));
            return this;
        }
        public HTTPIngressPathArgs build() {
            return new HTTPIngressPathArgs(backend, path, pathType);
        }
    }
}
