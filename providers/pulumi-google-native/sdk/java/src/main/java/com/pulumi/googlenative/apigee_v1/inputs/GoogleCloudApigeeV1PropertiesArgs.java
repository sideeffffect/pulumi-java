// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1PropertyArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Message for compatibility with legacy Edge specification for Java Properties object in JSON.
 * 
 */
public final class GoogleCloudApigeeV1PropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1PropertiesArgs Empty = new GoogleCloudApigeeV1PropertiesArgs();

    /**
     * List of all properties in the object
     * 
     */
    @Import(name="property")
    private @Nullable Output<List<GoogleCloudApigeeV1PropertyArgs>> property;

    public Optional<Output<List<GoogleCloudApigeeV1PropertyArgs>>> property() {
        return Optional.ofNullable(this.property);
    }

    private GoogleCloudApigeeV1PropertiesArgs() {}

    private GoogleCloudApigeeV1PropertiesArgs(GoogleCloudApigeeV1PropertiesArgs $) {
        this.property = $.property;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudApigeeV1PropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudApigeeV1PropertiesArgs $;

        public Builder() {
            $ = new GoogleCloudApigeeV1PropertiesArgs();
        }

        public Builder(GoogleCloudApigeeV1PropertiesArgs defaults) {
            $ = new GoogleCloudApigeeV1PropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder property(@Nullable Output<List<GoogleCloudApigeeV1PropertyArgs>> property) {
            $.property = property;
            return this;
        }

        public Builder property(List<GoogleCloudApigeeV1PropertyArgs> property) {
            return property(Output.of(property));
        }

        public Builder property(GoogleCloudApigeeV1PropertyArgs... property) {
            return property(List.of(property));
        }

        public GoogleCloudApigeeV1PropertiesArgs build() {
            return $;
        }
    }

}
