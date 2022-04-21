// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DocumentationPartLocationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DocumentationPartLocationGetArgs Empty = new DocumentationPartLocationGetArgs();

    /**
     * The HTTP verb of a method. The default value is `*` for any method.
     * 
     */
    @Import(name="method")
    private @Nullable Output<String> method;

    public Optional<Output<String>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * The name of the targeted API entity.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The URL path of the target. The default value is `/` for the root resource.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * The HTTP status code of a response. The default value is `*` for any status code.
     * 
     */
    @Import(name="statusCode")
    private @Nullable Output<String> statusCode;

    public Optional<Output<String>> statusCode() {
        return Optional.ofNullable(this.statusCode);
    }

    /**
     * The type of API entity to which the documentation content appliesE.g., `API`, `METHOD` or `REQUEST_BODY`
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private DocumentationPartLocationGetArgs() {}

    private DocumentationPartLocationGetArgs(DocumentationPartLocationGetArgs $) {
        this.method = $.method;
        this.name = $.name;
        this.path = $.path;
        this.statusCode = $.statusCode;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DocumentationPartLocationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DocumentationPartLocationGetArgs $;

        public Builder() {
            $ = new DocumentationPartLocationGetArgs();
        }

        public Builder(DocumentationPartLocationGetArgs defaults) {
            $ = new DocumentationPartLocationGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder method(@Nullable Output<String> method) {
            $.method = method;
            return this;
        }

        public Builder method(String method) {
            return method(Output.of(method));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder statusCode(@Nullable Output<String> statusCode) {
            $.statusCode = statusCode;
            return this;
        }

        public Builder statusCode(String statusCode) {
            return statusCode(Output.of(statusCode));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DocumentationPartLocationGetArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
