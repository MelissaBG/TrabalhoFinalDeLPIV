package trabalhofinaldelpiv.home.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Ltrabalhofinaldelpiv/home/data/ListCharacterApi;", "", "getListCharacters", "Lretrofit2/Response;", "", "Ltrabalhofinaldelpiv/home/data/CharacterResponse;", "userId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveCharacter", "", "character", "Ltrabalhofinaldelpiv/home/data/CharacterRequest;", "(ILtrabalhofinaldelpiv/home/data/CharacterRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ListCharacterApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "api/character/{userId}")
    public abstract java.lang.Object saveCharacter(@retrofit2.http.Path(value = "userId")
    int userId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    trabalhofinaldelpiv.home.data.CharacterRequest character, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<kotlin.Unit>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/character/{userId}")
    public abstract java.lang.Object getListCharacters(@retrofit2.http.Path(value = "userId")
    int userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<trabalhofinaldelpiv.home.data.CharacterResponse>>> continuation);
}