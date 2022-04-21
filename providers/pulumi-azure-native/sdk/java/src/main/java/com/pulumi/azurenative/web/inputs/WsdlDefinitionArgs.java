// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.enums.WsdlImportMethod;
import com.pulumi.azurenative.web.inputs.WsdlServiceArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The WSDL definition
 * 
 */
public final class WsdlDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final WsdlDefinitionArgs Empty = new WsdlDefinitionArgs();

    /**
     * The WSDL content
     * 
     */
    @Import(name="content")
    private @Nullable Output<String> content;

    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * The WSDL import method
     * 
     */
    @Import(name="importMethod")
    private @Nullable Output<Either<String,WsdlImportMethod>> importMethod;

    public Optional<Output<Either<String,WsdlImportMethod>>> importMethod() {
        return Optional.ofNullable(this.importMethod);
    }

    /**
     * The service with name and endpoint names
     * 
     */
    @Import(name="service")
    private @Nullable Output<WsdlServiceArgs> service;

    public Optional<Output<WsdlServiceArgs>> service() {
        return Optional.ofNullable(this.service);
    }

    /**
     * The WSDL URL
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private WsdlDefinitionArgs() {}

    private WsdlDefinitionArgs(WsdlDefinitionArgs $) {
        this.content = $.content;
        this.importMethod = $.importMethod;
        this.service = $.service;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WsdlDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WsdlDefinitionArgs $;

        public Builder() {
            $ = new WsdlDefinitionArgs();
        }

        public Builder(WsdlDefinitionArgs defaults) {
            $ = new WsdlDefinitionArgs(Objects.requireNonNull(defaults));
        }

        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        public Builder content(String content) {
            return content(Output.of(content));
        }

        public Builder importMethod(@Nullable Output<Either<String,WsdlImportMethod>> importMethod) {
            $.importMethod = importMethod;
            return this;
        }

        public Builder importMethod(Either<String,WsdlImportMethod> importMethod) {
            return importMethod(Output.of(importMethod));
        }

        public Builder service(@Nullable Output<WsdlServiceArgs> service) {
            $.service = service;
            return this;
        }

        public Builder service(WsdlServiceArgs service) {
            return service(Output.of(service));
        }

        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        public Builder url(String url) {
            return url(Output.of(url));
        }

        public WsdlDefinitionArgs build() {
            return $;
        }
    }

}
