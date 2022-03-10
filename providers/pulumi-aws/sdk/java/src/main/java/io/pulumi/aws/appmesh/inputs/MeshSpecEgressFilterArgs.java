// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MeshSpecEgressFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final MeshSpecEgressFilterArgs Empty = new MeshSpecEgressFilterArgs();

    /**
     * The egress filter type. By default, the type is `DROP_ALL`.
     * Valid values are `ALLOW_ALL` and `DROP_ALL`.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public MeshSpecEgressFilterArgs(@Nullable Input<String> type) {
        this.type = type;
    }

    private MeshSpecEgressFilterArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MeshSpecEgressFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(MeshSpecEgressFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public MeshSpecEgressFilterArgs build() {
            return new MeshSpecEgressFilterArgs(type);
        }
    }
}
