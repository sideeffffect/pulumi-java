// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancing.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AttachmentState extends io.pulumi.resources.ResourceArgs {

    public static final AttachmentState Empty = new AttachmentState();

    /**
     * The name of the ELB.
     * 
     */
    @Import(name="elb")
      private final @Nullable Output<String> elb;

    public Output<String> elb() {
        return this.elb == null ? Codegen.empty() : this.elb;
    }

    /**
     * Instance ID to place in the ELB pool.
     * 
     */
    @Import(name="instance")
      private final @Nullable Output<String> instance;

    public Output<String> instance() {
        return this.instance == null ? Codegen.empty() : this.instance;
    }

    public AttachmentState(
        @Nullable Output<String> elb,
        @Nullable Output<String> instance) {
        this.elb = elb;
        this.instance = instance;
    }

    private AttachmentState() {
        this.elb = Codegen.empty();
        this.instance = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> elb;
        private @Nullable Output<String> instance;

        public Builder() {
    	      // Empty
        }

        public Builder(AttachmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elb = defaults.elb;
    	      this.instance = defaults.instance;
        }

        public Builder elb(@Nullable Output<String> elb) {
            this.elb = elb;
            return this;
        }
        public Builder elb(@Nullable String elb) {
            this.elb = Codegen.ofNullable(elb);
            return this;
        }
        public Builder instance(@Nullable Output<String> instance) {
            this.instance = instance;
            return this;
        }
        public Builder instance(@Nullable String instance) {
            this.instance = Codegen.ofNullable(instance);
            return this;
        }        public AttachmentState build() {
            return new AttachmentState(elb, instance);
        }
    }
}
