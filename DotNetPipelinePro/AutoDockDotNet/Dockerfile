FROM mcr.microsoft.com/dotnet/sdk:7.0 AS build
WORKDIR /src
COPY ["SimpleDotNetAPI.csproj", "./"]
RUN dotnet restore "./SimpleDotNetAPI.csproj"
COPY . .
RUN dotnet publish "./SimpleDotNetAPI.csproj" -c Release -o /app/publish

FROM mcr.microsoft.com/dotnet/aspnet:7.0 AS runtime
WORKDIR /app
COPY --from=build /app/publish .
EXPOSE 8080
ENTRYPOINT ["dotnet", "SimpleDotNetAPI.dll"]
