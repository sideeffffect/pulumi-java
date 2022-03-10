// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.networking.k8s.io_v1beta1.inputs.HTTPIngressPathArgs;
import java.util.List;
import java.util.Objects;


/**
 * HTTPIngressRuleValue is a list of http selectors pointing to backends. In the example: http://<host>/<path>?<searchpart> -> backend where where parts of the url correspond to RFC 3986, this resource will be used to match against everything after the last '/' and before the first '?' or '#'.
 * 
 */
public final class HTTPIngressRuleValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final HTTPIngressRuleValueArgs Empty = new HTTPIngressRuleValueArgs();

    /**
     * A collection of paths that map requests to backends.
     * 
     */
    @InputImport(name="paths", required=true)
      private final Input<List<HTTPIngressPathArgs>> paths;

    public Input<List<HTTPIngressPathArgs>> getPaths() {
        return this.paths;
    }

    public HTTPIngressRuleValueArgs(Input<List<HTTPIngressPathArgs>> paths) {
        this.paths = Objects.requireNonNull(paths, "expected parameter 'paths' to be non-null");
    }

    private HTTPIngressRuleValueArgs() {
        this.paths = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HTTPIngressRuleValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<HTTPIngressPathArgs>> paths;

        public Builder() {
    	      // Empty
        }

        public Builder(HTTPIngressRuleValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.paths = defaults.paths;
        }

        public Builder paths(Input<List<HTTPIngressPathArgs>> paths) {
            this.paths = Objects.requireNonNull(paths);
            return this;
        }

        public Builder paths(List<HTTPIngressPathArgs> paths) {
            this.paths = Input.of(Objects.requireNonNull(paths));
            return this;
        }
        public HTTPIngressRuleValueArgs build() {
            return new HTTPIngressRuleValueArgs(paths);
        }
    }
}
