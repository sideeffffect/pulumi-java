// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Details of the Azure resource that was assessed
 * 
 */
public final class AzureResourceDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureResourceDetailsArgs Empty = new AzureResourceDetailsArgs();

    /**
     * The platform where the assessed resource resides
     * Expected value is &#39;Azure&#39;.
     * 
     */
    @Import(name="source", required=true)
    private Output<String> source;

    public Output<String> source() {
        return this.source;
    }

    private AzureResourceDetailsArgs() {}

    private AzureResourceDetailsArgs(AzureResourceDetailsArgs $) {
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureResourceDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureResourceDetailsArgs $;

        public Builder() {
            $ = new AzureResourceDetailsArgs();
        }

        public Builder(AzureResourceDetailsArgs defaults) {
            $ = new AzureResourceDetailsArgs(Objects.requireNonNull(defaults));
        }

        public Builder source(Output<String> source) {
            $.source = source;
            return this;
        }

        public Builder source(String source) {
            return source(Output.of(source));
        }

        public AzureResourceDetailsArgs build() {
            $.source = Codegen.stringProp("source").output().arg($.source).require();
            return $;
        }
    }

}
