// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


/**
 * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
 * 
 */
public final class ObjectIdArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectIdArgs Empty = new ObjectIdArgs();

    /**
     * The parts of an OID path. The most significant parts of the path come first.
     * 
     */
    @Import(name="objectIdPath", required=true)
      private final Output<List<Integer>> objectIdPath;

    public Output<List<Integer>> objectIdPath() {
        return this.objectIdPath;
    }

    public ObjectIdArgs(Output<List<Integer>> objectIdPath) {
        this.objectIdPath = Objects.requireNonNull(objectIdPath, "expected parameter 'objectIdPath' to be non-null");
    }

    private ObjectIdArgs() {
        this.objectIdPath = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<Integer>> objectIdPath;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectIdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectIdPath = defaults.objectIdPath;
        }

        public Builder objectIdPath(Output<List<Integer>> objectIdPath) {
            this.objectIdPath = Objects.requireNonNull(objectIdPath);
            return this;
        }
        public Builder objectIdPath(List<Integer> objectIdPath) {
            this.objectIdPath = Output.of(Objects.requireNonNull(objectIdPath));
            return this;
        }
        public Builder objectIdPath(Integer... objectIdPath) {
            return objectIdPath(List.of(objectIdPath));
        }        public ObjectIdArgs build() {
            return new ObjectIdArgs(objectIdPath);
        }
    }
}
