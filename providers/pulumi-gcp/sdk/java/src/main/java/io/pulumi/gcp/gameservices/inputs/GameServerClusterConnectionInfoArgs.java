// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.gameservices.inputs.GameServerClusterConnectionInfoGkeClusterReferenceArgs;
import java.lang.String;
import java.util.Objects;


public final class GameServerClusterConnectionInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final GameServerClusterConnectionInfoArgs Empty = new GameServerClusterConnectionInfoArgs();

    /**
     * Reference of the GKE cluster where the game servers are installed.
     * Structure is documented below.
     * 
     */
    @InputImport(name="gkeClusterReference", required=true)
      private final Input<GameServerClusterConnectionInfoGkeClusterReferenceArgs> gkeClusterReference;

    public Input<GameServerClusterConnectionInfoGkeClusterReferenceArgs> getGkeClusterReference() {
        return this.gkeClusterReference;
    }

    /**
     * Namespace designated on the game server cluster where the game server
     * instances will be created. The namespace existence will be validated
     * during creation.
     * 
     */
    @InputImport(name="namespace", required=true)
      private final Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace;
    }

    public GameServerClusterConnectionInfoArgs(
        Input<GameServerClusterConnectionInfoGkeClusterReferenceArgs> gkeClusterReference,
        Input<String> namespace) {
        this.gkeClusterReference = Objects.requireNonNull(gkeClusterReference, "expected parameter 'gkeClusterReference' to be non-null");
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
    }

    private GameServerClusterConnectionInfoArgs() {
        this.gkeClusterReference = Input.empty();
        this.namespace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerClusterConnectionInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<GameServerClusterConnectionInfoGkeClusterReferenceArgs> gkeClusterReference;
        private Input<String> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerClusterConnectionInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gkeClusterReference = defaults.gkeClusterReference;
    	      this.namespace = defaults.namespace;
        }

        public Builder gkeClusterReference(Input<GameServerClusterConnectionInfoGkeClusterReferenceArgs> gkeClusterReference) {
            this.gkeClusterReference = Objects.requireNonNull(gkeClusterReference);
            return this;
        }

        public Builder gkeClusterReference(GameServerClusterConnectionInfoGkeClusterReferenceArgs gkeClusterReference) {
            this.gkeClusterReference = Input.of(Objects.requireNonNull(gkeClusterReference));
            return this;
        }

        public Builder namespace(Input<String> namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public Builder namespace(String namespace) {
            this.namespace = Input.of(Objects.requireNonNull(namespace));
            return this;
        }
        public GameServerClusterConnectionInfoArgs build() {
            return new GameServerClusterConnectionInfoArgs(gkeClusterReference, namespace);
        }
    }
}
