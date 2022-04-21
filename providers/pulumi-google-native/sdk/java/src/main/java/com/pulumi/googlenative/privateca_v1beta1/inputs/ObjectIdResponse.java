// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


/**
 * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
 * 
 */
public final class ObjectIdResponse extends com.pulumi.resources.InvokeArgs {

    public static final ObjectIdResponse Empty = new ObjectIdResponse();

    /**
     * The parts of an OID path. The most significant parts of the path come first.
     * 
     */
    @Import(name="objectIdPath", required=true)
    private List<Integer> objectIdPath;

    public List<Integer> objectIdPath() {
        return this.objectIdPath;
    }

    private ObjectIdResponse() {}

    private ObjectIdResponse(ObjectIdResponse $) {
        this.objectIdPath = $.objectIdPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectIdResponse $;

        public Builder() {
            $ = new ObjectIdResponse();
        }

        public Builder(ObjectIdResponse defaults) {
            $ = new ObjectIdResponse(Objects.requireNonNull(defaults));
        }

        public Builder objectIdPath(List<Integer> objectIdPath) {
            $.objectIdPath = objectIdPath;
            return this;
        }

        public Builder objectIdPath(Integer... objectIdPath) {
            return objectIdPath(List.of(objectIdPath));
        }

        public ObjectIdResponse build() {
            $.objectIdPath = Objects.requireNonNull($.objectIdPath, "expected parameter 'objectIdPath' to be non-null");
            return $;
        }
    }

}
