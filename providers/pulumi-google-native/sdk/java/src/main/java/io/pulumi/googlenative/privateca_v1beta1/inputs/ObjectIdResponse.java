// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


/**
 * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
 * 
 */
public final class ObjectIdResponse extends io.pulumi.resources.InvokeArgs {

    public static final ObjectIdResponse Empty = new ObjectIdResponse();

    /**
     * The parts of an OID path. The most significant parts of the path come first.
     * 
     */
    @InputImport(name="objectIdPath", required=true)
      private final List<Integer> objectIdPath;

    public List<Integer> getObjectIdPath() {
        return this.objectIdPath;
    }

    public ObjectIdResponse(List<Integer> objectIdPath) {
        this.objectIdPath = Objects.requireNonNull(objectIdPath, "expected parameter 'objectIdPath' to be non-null");
    }

    private ObjectIdResponse() {
        this.objectIdPath = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Integer> objectIdPath;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectIdPath = defaults.objectIdPath;
        }

        public Builder objectIdPath(List<Integer> objectIdPath) {
            this.objectIdPath = Objects.requireNonNull(objectIdPath);
            return this;
        }
        public ObjectIdResponse build() {
            return new ObjectIdResponse(objectIdPath);
        }
    }
}
